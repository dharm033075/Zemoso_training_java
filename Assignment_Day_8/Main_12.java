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
        String fileRPath;
        Scanner sc=new Scanner(System.in);
        System.out.println("give your file name to be read");
        String fileR=sc.next();
        fileRPath=new File(fileR).getAbsolutePath();// gives full path of the file from the root
        System.out.println(fileRPath);
        System.out.println("give your file name in which to be write");
        String fileW=sc.next();
        String fileWPath=new File(fileW).getAbsolutePath();// givesfull path of the file from root
        System.out.println(fileWPath);

        Map<Character,Integer> newfile= TextFile.readAndWrite(fileRPath,fileWPath);
       /**
       this above function will convert file into string (readable format) and will also store the occurances of the different character
        Then finally write this map into the text file as user give
        */
           }
}
