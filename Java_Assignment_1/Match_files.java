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
     /**
     *
     * @param file: main directory that would be searched for a particular file expression
     * @param search : expression of file name that would be searched in directory
     * @return recursively call this function return true if a file is matched to given expression
     */
    static boolean filefounder(File file, String search)throws NullPointerException {
        /**
         * below it check weather given file is directory or not
         * if it is directory then by using regex pattern it will match the our defined regex
         * and finally prints the matched result
         */
        boolean found=false;
        File[] files = file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                found=filefounder(f,search);
            }else{
                Pattern pattern=Pattern.compile(search);
                Matcher m=pattern.matcher(f.getName());
                if(m.find()){
                   System.out.println(f.getAbsolutePath());
                   return true;
                }
            }
        }
      return found;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("Please enter the file(Not Folder) Name regex for searching, enter String 'exit' for Exit");
            String fileNameOrPatternOfFileToSearch=sc.next();
           try{
               if(fileNameOrPatternOfFileToSearch.matches("exit")){
                   break;
               }else{
                   System.out.println(filefounder(new File("/home"),fileNameOrPatternOfFileToSearch)?"Yes,found some files":"Not found,give file name which exist");
               }
           }catch(NullPointerException e){
               System.out.println("give existing file name / It won't search for folder only files will searched");
           }

        }
    }
}