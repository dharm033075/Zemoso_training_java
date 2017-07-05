package Assignment_5;

/**
 * Created by zemoso on 2/7/17.
 */
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;
import java.util.regex.*;
//import java.util.regex.Pattern;
//import java.sutil.regex.Matcher;
public class pattern_matching {
    public static void main(String[] args){
        /* Scanner used for taking input from the user */
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
       //Words which are starting from capital letter and ending with . , this type pattern created
       Pattern pattern=Pattern.compile("^[A-Z].*[.]$");//"<option value=\"(.*?)\">(.*?)</option>"//\b[A-Z]\p{all}+\b[.]
       Matcher match=pattern.matcher(st);//matches the pattern with user input line
       while(match.find()){
           System.out.println(match.group(0));// printed the default first group of the match
       }

    }
}
