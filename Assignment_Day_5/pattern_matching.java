package Assignment_5;

/**
 * Created by zemoso on 2/7/17.
 */
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.*;
//public static void patternMatcher(String inputstr){

  //      }
public class pattern_matching {
    public static void main(String[] args){
        /* Scanner used for taking input from the user */
        System.out.println("Please give input");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] splitString=st.split(" ");
        System.out.println("Pattern matched with");
        for(String x:splitString){
            if(x.matches("^[A-Z].*[.]$")){
                System.out.println(x);
            }

        }
    }
}
