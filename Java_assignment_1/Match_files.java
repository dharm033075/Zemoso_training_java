package Matches_files;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
import java.util.regex.Pattern;

/**
 * Created by zemoso on 5/7/17.
 *
 */

public class Match_files {
    public static int countOfFile=0;

     /**
     *
     * @param file: main directory that would be searched for a particular file expression
     * @param search : expression of file name that would be searched in directory
     * @return recursively call this function return true if a file is matched to given expression
     */
    static boolean filefounder(File file, String search) {

        /**
         * below it check weather given file is directory or not
         * if it is directory then by using regex pattern it will match the our defined regex
         * and finally prints the matched result
         */
        boolean found=false;
        File[] files = file.listFiles();

        for(File f:files){
            if(f.isDirectory()){
                //System.out.println(f.getName()+"this is going for check in dir");
                found=filefounder(f,search);

            }else{
               // System.out.println(search);
                Pattern pattern=Pattern.compile(search);
                Matcher m=pattern.matcher(f.getName());
                if(m.find()){
                   System.out.println(f.getAbsolutePath());
                   countOfFile++;
                    return true;
                }

            }
        }
      return found;
    }
    public static void main(String[] args) {
        System.out.println("Please enter the file Name or Any pattern of file name you want to search");
       Scanner sc= new Scanner(System.in);
       String fileNameOrPatternOfFileToSearch=sc.next();
       filefounder(new File("/home"),fileNameOrPatternOfFileToSearch);

    }
}