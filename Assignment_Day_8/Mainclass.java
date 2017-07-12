package reading_writing_file;
import java.util.Scanner;
import java.io.File;
/**
 * Created by zemoso on 4/7/17.
 */
public class Mainclass {
    public static void main(String[] args){
        String fileRPath;
        Scanner sc=new Scanner(System.in);
        System.out.println("give your file name to be read");
        String fileR=sc.next();
        fileRPath=new File(fileR).getAbsolutePath();// gives full path of the file from the root
        System.out.println(fileRPath);
       /**
         *
         *this above function will convert file into string (readable format) and will also store the occurances of the different character
         *Then finally write this map into the text file as user give
         *@param fileRpath file path which going to be read
         */
       ReadWrite.readFromFile(fileRPath);
    }
}
