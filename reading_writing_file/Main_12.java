package reading_writing_file;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.util.List;

/**
 * Created by zemoso on 4/7/17.
 */
public class Main_12 {
    public static void main(String[] args){
        String fn;
        //below are commented for custom file name in respective laptop.
        Scanner sc=new Scanner(System.in);
        System.out.println("give your file name to be read");
        String fileR=sc.next();
        System.out.println("give your file name in which to be write");
        String fileW=sc.next();
        // gives the full path of the file from the root
        fn=new File(fileR).getAbsolutePath();
        String fn_w=new File(fileW).getAbsolutePath();
        System.out.println(fn);
        //fn="/home/zemoso/rahul.txt";
       Map<Character,Integer> newfile= TextFile.read(fn,fn_w);
       /*
       this above function will convert file into string (readable format) and will also store the occurances of the different character
        Then finally write this map into the text file as user give
        */
           }
}
