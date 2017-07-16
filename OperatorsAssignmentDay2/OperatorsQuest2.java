package OperatorsAssignmentDay2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zemoso on 28/6/17.
 */
public class OperatorsQuest2 {
    /**
     * created the two constructor of a class
     * here below we are calling second constructor from first constructor
     */
    public OperatorsQuest2(){
           this("calling second constructor from first");
    }

    public OperatorsQuest2(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        try{
            OperatorsQuest2 firstConstructorCall=new OperatorsQuest2();
            Scanner sc= new Scanner(System.in);
            System.out.println(" call to second constructor, Enter some strings");
            OperatorsQuest2 secondConstructorCall=new OperatorsQuest2(sc.next());

        }catch(InputMismatchException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
