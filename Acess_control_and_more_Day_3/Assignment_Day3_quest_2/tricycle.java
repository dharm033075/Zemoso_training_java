package Assignment_3_quest_2;

/**
 * Created by zemoso on 1/7/17.
 */
public class tricycle extends Cycle {

    public static void main(String[] args){
        Cycle[] p1=new Cycle[3];
        p1[0]=new unicycle();
        p1[1]=new bicycle();
        p1[2]=new tricycle();
        //p[1].balance(); p[0].balance(); gives the error coz it has no longer access to balance once upcasted
        //but when downcast these two code will work fine
        unicycle z=(unicycle)p1[0];
        z.balance();
        bicycle z1=(bicycle)p1[1];
        z1.balance();

    }
}
