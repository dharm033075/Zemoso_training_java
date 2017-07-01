package Assignment_3.Assignment_3_question2;

/**
 * Created by zemoso on 30/6/17.
 */
public class Main_class_2 {
    public static void main(){
        Cycle[] cy=new Cycle[3];
        bicycle bc=new bicycle();
        unicycle uc=new unicycle();
        tricycle tc = new tricycle();
        cy[0]=bc; cy[1]=uc;cy[2]=tc;
        //cy[0].balance();cy[1].balance();cy[2].balance(); this code line gives error
        // because upcasted variable don't have balance function. but when wee downcast it
        // it will again have access to balance. when we upcast a object while extending a class(base class) the object will
        //have access to all base class function and whatever in his sub class it won't have access. after downcasting
        // it will again access the function of its derived class

        bc= (bicycle)cy[0];
        uc=(unicycle) cy[1];
        bc.balance();
        uc.balance();

    }
}
