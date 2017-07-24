package PingAnIP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import static java.lang.System.in;
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
    public static boolean getAVGrtt(String pingAddress,int npings) throws IOException,ArithmeticException,
            IndexOutOfBoundsException,InputMismatchException{
        List<Double> arr=new ArrayList<>();
        double medRtt;
        try{
            /**
             * First taking the input as IP or hostname and number of pings. made these inputs as string to run on terminal
             * then from the output median rtt time is extraced using split and indexof
             */

            double RTT=0.0;
            try {
            }catch(NumberFormatException e) {
                System.out.println("Input is not a valid integer but it will at least once");
            }
            String s="ping -c "+npings+" "+ pingAddress;
            Process p=Runtime.getRuntime().exec(s);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String outputs="";
            while((outputs=inputStream.readLine())!=null){
                 if(outputs.indexOf("time=")>0){
                    System.out.println("RTT is per ping to host IP "+outputs.substring(outputs.indexOf("time=")));
                    String str2=outputs.substring(outputs.indexOf("time="));
                    String str3= str2.substring(str2.indexOf("=")+1,str2.length()-3);
                    RTT=Double.parseDouble(str3);
                    arr.add(RTT);
                }
            }

            Collections.sort(arr);
            System.out.println(arr.toString());
            if(arr.size()==1){
                medRtt=arr.get(0);
            }else if(arr.size()%npings==0 && npings!=0){
                medRtt=(arr.get((npings/2)-1)+arr.get((npings/2)))/2;
                }
            else{
                medRtt=arr.get((npings/2));
                  System.out.println(medRtt);
            }
            System.out.println(arr.size()!=0?"Median Round trip time to ping to host is: "+medRtt:"Plz enter the right ping Adress");
        }catch(Exception e){
            System.out.println("your given input is not valid");
        }
        return arr.size()==0?true:false;
    }
    /**
     *
     * @param choiceOfInput in which format user want to give adress
     * @return String type ping adress
     */
    public static String inputChoice(int choiceOfInput){
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
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(in);
            System.out.println("Enter the digit, that many times you want to ping the host");
            int npings=sc.nextInt();
            System.out.println("You want to ping by IP(=0) or domain name");
            int choiceofinput=sc.nextInt();
            getAVGrtt(inputChoice(choiceofinput),npings);
        }catch(IOException|InputMismatchException | IndexOutOfBoundsException e){
            System.out.println("Entered values are not valid");
        }
    }
}
