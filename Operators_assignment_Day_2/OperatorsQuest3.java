package Operators_assignment_Day_2;

import java.util.Scanner;

/**
 * Created by zemoso on 29/6/17.
 */
public class OperatorsQuest3 {
    public OperatorsQuest3(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        OperatorsQuest3[] arrayOfClass;
        OperatorsQuest3 Object1=new OperatorsQuest3("dharm");
        System.out.println("Enter something to for  the class constructor call");
        OperatorsQuest3 Object2=new OperatorsQuest3(new Scanner(System.in).next());
       /* below statement asking for initialization of the arrayOfClass*/
        // arrayOfClass={Object1,Object2};
        OperatorsQuest3[] arrayOfNewClass={Object1,Object2};
    }
}
