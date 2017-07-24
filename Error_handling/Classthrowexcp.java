package Error_handling;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zemoso on 1/7/17.
 */
public class Classthrowexcp {
    public static void methodThrowError(int t) throws newException1, newException2, newException3 {

                  if(t==0){
                      throw new newException1("IO exception) ");
                  }else if(t==2){
                      throw new newException2();
                  }else {
                      throw new newException3("Some defined error");
                  }
    }
    public static void main(String[] args) throws InputMismatchException  {
        System.out.println("Enter the Intger value");
        Scanner sc= new Scanner(System.in);

        try{
            int t=sc.nextInt();
            methodThrowError(t);
            }catch(newException1 | newException2 | newException3 | InputMismatchException e) {
               e.printStackTrace(System.out);
           }finally{
               System.out.println("This have to be print coz its in finally");
        }

    }

}
