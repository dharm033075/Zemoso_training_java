package Assignment_5;

/**
 * Created by zemoso on 2/7/17.
 */
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.*;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
public class pattern_matching {
    public static void main(String[] args){

       String st=("Dharmraj. My and his But.\n what about You.");
       System.out.println("in put line is:> "+st);
       Pattern pattern=Pattern.compile(("((?m)([A-z]+[.]))"));
       Matcher match=pattern.matcher(st);
       while(match.find()){
           System.out.println(match.group()+" ");
       }

    }
}
