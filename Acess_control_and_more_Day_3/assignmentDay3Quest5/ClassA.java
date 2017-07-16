package Acess_control_and_more_Day_3.assignmentDay3Quest5;

/**
 * Created by zemoso on 1/7/17.
 */
public class ClassA{
    public class InnerClassA{
        public InnerClassA(int n){
            System.out.println("constructor of the first inner class of classA "+" "+n);

        }
        public void printSomething(){
            System.out.println("some task done by first inner class method");

        }
    }
}
