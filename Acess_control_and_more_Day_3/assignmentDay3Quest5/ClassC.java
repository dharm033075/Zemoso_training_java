package Acess_control_and_more_Day_3.assignmentDay3Quest5;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zemoso on 1/7/17.
 */
public class ClassC {

    public class InnerClassC extends ClassA.InnerClassA {

        public InnerClassC(ClassA classA, int value) {
               classA.super(value);
        }

        @Override
        public void printSomething() {

            System.out.println("This is override in Class c inner class after extend");
        }
    }
    public static void main(String[] args) {
        ClassA classA=new ClassA();
        ClassC classC= new ClassC();

        try {
             System.out.println("Enter value");

             Scanner sc= new Scanner(System.in);

             ClassA.InnerClassA innerclassA=classC.new InnerClassC(classA,sc.nextInt());
             innerclassA.printSomething();

        } catch( NullPointerException | InputMismatchException e ){
               e.printStackTrace();
        }
    }
}
