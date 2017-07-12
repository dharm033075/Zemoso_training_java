package Java_assignment_2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * Created by zemoso on 12/7/17.
 */
public class CheckATOZChar {
        public static boolean checkAlphabatsinString(BufferedReader bf) throws IOException {
            boolean[] tf = new boolean[26];int i;
            boolean b=true;
            Arrays.fill(tf, false);
                while ((i = bf.read()) != 10) {
                    if ((i >= 97 && i <= 122)) {
                        tf[i - 97] = true;
                    } else if (i <= 90 && i >= 65) {
                        tf[i - 65] = true;
                    }
                }
            bf.close();
            for (int p = 0; p <= 25; p++) {
                b = (b & tf[p]);
                System.out.println(tf[p]+" " +b);
                if (b==false) {
                    break;
                }
            }
            return (b);
        }

        public static void main(String[] args) {
            System.out.println("Enter the string");
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            try{
                if(checkAlphabatsinString(bf)){
                    System.out.println("yes, this given input string has all a to z characters");
                }else{
                    System.out.println("No, this given input string don't have all a to z characters");
                }
            }catch(IOException e){
                System.out.println(" got the IO error");
            }


        }
    }


