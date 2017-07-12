package dharmraj.assignment.main;
import  dharmraj.assignment.singleton.secondClass;
import dharmraj.assignment.data.firstClass;
/**
 * Created by zemoso on 12/7/17.
 */
public class Main {
    public static void main(String[] args){
        firstClass firstObj=new firstClass();
        firstObj.printInfirstClass();
        firstObj.anotherMethod();
        secondClass secondObj=secondClass.staticMethod("String input for member initialization");
        secondObj.printMember();

    }
}
