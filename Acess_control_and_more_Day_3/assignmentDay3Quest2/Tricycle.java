package Acess_control_and_more_Day_3.assignmentDay3Quest2;

/**
 * Created by zemoso on 1/7/17.
 */
public class Tricycle extends Cycle {

    public static void main(String[] args){
        Cycle uniCycle=new Unicycle();
        Cycle biCycle=new Bicycle();
        Cycle triCycle=new Tricycle();

        /* Below call to balance method after Upcasting shows error because parent class won't
         * don't balance method */

        // uniCycle.balance();

        // biCycle.balance();

        // triCycle.balance();

        ((Unicycle) uniCycle).balance();

        ((Bicycle) biCycle).balance();

        /*triCycle after downcasting also won't have balance method*/

       // ((Tricycle)triCycle).balance();
    }
}
