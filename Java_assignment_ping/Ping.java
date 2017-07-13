package PingAnIP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.setIn;

/**
 * Created by zemoso on 6/7/17.
*/
public class Ping {
    /**
     *@param pingAddress pingAdress to be ping
     *@param nping1 Number of times want to ping
     * @return true if getting rtt of a ping
     *
     */
    public static boolean getAVGrtt(String pingAddress,int nping1){
        double medRtt=0.0;
        Scanner sc=new Scanner(System.in);
        try{
            /**
             * First taking the input as IP or hostname and number of pings. made these inputs as string to run on terminal
             * then from the output median rtt time is extraced using split and indexof
             */


            int nping=1;
            double medianRTTtime=0;
            try {
            }catch(NumberFormatException e) {
                System.out.println("Input is not a valid integer but it will at least once");
            }
            String s="ping -c "+nping+" "+ pingAddress;
            Process p=Runtime.getRuntime().exec(s);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String outputs="";

            while((outputs=inputStream.readLine())!=null){
                double RTT;
                if(outputs.indexOf("time=")>0){
                    System.out.println("RTT is per ping to host IP "+outputs.substring(outputs.indexOf("time=")));
                    String str2=outputs.substring(outputs.indexOf("time="));
                    String str3= str2.substring(str2.indexOf("=")+1,str2.length()-3);
                    RTT=Double.parseDouble(str3);
                    medianRTTtime=medianRTTtime+RTT;
                }
            }
            medRtt=(medianRTTtime/nping);
            System.out.println(medRtt!=0.0?"Median Round trip time to ping to host is: "+(medianRTTtime/nping):"Plz enter the right ping Adress");
        }catch(Exception e){
            e.printStackTrace();
        }
        return medRtt>0.0?true:false;
    }

    /**
     *
     * @param choiceOfInput in which format user want to give adress
     * @return String type ping adress
     */
    public static String inputchoice(int choiceOfInput){
        Scanner sc=new Scanner(System.in);
        String pingAddress;
        if(choiceOfInput==0){
            System.out.println("Enter the IP adress");
            pingAddress=sc.next();
        }else{
            System.out.println("Enter the domain name");
            pingAddress=sc.next();
        }
        return pingAddress;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("You want to ping by IP(=0) or domain name");
        Scanner sc=new Scanner(in);
        int choiceofinput=sc.nextInt();
        System.out.println("Enter the digit, that many times you want to ping the host");
        int nping1=sc.nextInt();
        getAVGrtt(inputchoice(choiceofinput),nping1);
    }

}
