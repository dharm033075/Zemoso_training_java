package dharmraj.assignment.data;

/**
 * Created by zemoso on 12/7/17.
 */
public class firstClass {
    public int a;
    public char c;
    public void printInfirstClass(){
        System.out.println(a+c);
    }
    public void anotherMethod(){
        int z; char y;
        /**
         * local variables z and y not initialized in  the method.
         * in case of a and c they are in class and in class primitives get default initialized with 0 or null
         */
        //System.out.println(a+""+c);
    }
    public static void main(String[] args){

    }

}
