package PingAnIP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by zemoso on 6/7/17.
*/
public class Ping {
    public static double getAVGrtt(int choiceOfInput){
        double medRtt=0.0;
        try{
            /**
             * First taking the input as IP or hostname and number of pings. made these inputs as string to run on terminal
             * then from the output median rtt time is extraced using split and indexof
             */

            String pingAddress;
            Scanner sc=new Scanner(System.in);
            if(choiceOfInput==0){
                System.out.println("Enter the IP adress");
                pingAddress=sc.next();
            }else{
                System.out.println("Enter the domain name");
                pingAddress=sc.next();
            }
            System.out.println("Enter the digit, that many times you want to ping the host");
            int nping=sc.nextInt();
            double medianRTTtime=0;
            String s="ping -c "+nping+" "+ pingAddress;
            Process p=Runtime.getRuntime().exec(s);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String outputs="";

            while((outputs=inputStream.readLine())!=null){
                double RTT;
                if(outputs.indexOf("time=")>0){
                    System.out.println("this RTT is per ping to host IP "+outputs.substring(outputs.indexOf("time=")));
                    String str2=outputs.substring(outputs.indexOf("time="));
                    String str3= str2.substring(str2.indexOf("=")+1,str2.length()-3);
                    System.out.println(str3);
                    RTT=Double.parseDouble(str3);
                    medianRTTtime=medianRTTtime+RTT;
                }
            }
            medRtt=(medianRTTtime/nping);
            System.out.println("Median Round trip time to ping to host is: "+(medianRTTtime/nping)); //print the average median rtt time
        }catch(Exception e){
            e.printStackTrace();
        }
        return medRtt;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("You want to ping by IP(=0) or domain name");
        Scanner sc=new Scanner(System.in);
        int choiceofinput=sc.nextInt();
        double med=getAVGrtt(choiceofinput);


    }

}
