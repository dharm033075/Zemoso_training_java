package Error_handling;

import java.awt.*;

/**
 * Created by zemoso on 1/7/17.
 */
public class classthrowexcp  {
    public static void f(int t) throws new_exception1,new_exception2,new_exception3{

                  if(t!=0){
                      throw new new_exception1();
                  }else if(t!=2){
                      throw new new_exception2();
                  }else {
                      throw new new_exception3();
                  }
    }
    public static void main(String[] args){

        try{
            f(0);

           }catch(new_exception1 | new_exception2 | new_exception3 e){
               e.printStackTrace(System.out);
           }finally{
               System.out.println("this have to be print coz its in finally");
        }

    }

}
