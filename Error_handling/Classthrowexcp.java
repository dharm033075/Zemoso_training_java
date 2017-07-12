package Error_handling;
import java.util.Scanner;

/**
 * Created by zemoso on 1/7/17.
 */
public class Classthrowexcp {
    public static void methodThrowError(int t) throws newException1, newException2, newException3 {

                  if(t==0){
                      throw new newException1();
                  }else if(t==2){
                      throw new newException2();
                  }else {
                      throw new newException3();
                  }
    }
    public static void main(String[] args){
        System.out.println("Enter the Intger value");
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        try{
            methodThrowError(t);
            }catch(newException1 | newException2 | newException3 e){
               e.printStackTrace(System.out);
           }finally{
               System.out.println("This have to be print coz its in finally");
        }

    }

}
