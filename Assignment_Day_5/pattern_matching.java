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
    public static boolean regexmatch(String s){
        if(s.matches("^[A-Z].*[.]$")){System.out.println(" This sentence is matched\n"+s);}
        return s.matches("^[A-Z].*[.]$")?true:false;
    }

    public static void main(String[] args){
        System.out.println("Please give input");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        regexmatch(st);
    }
}
