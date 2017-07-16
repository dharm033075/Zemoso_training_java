package Acess_control_and_more_Day_3.assignmentDay3Quest4;

import java.util.Scanner;

/**
 * Created by zemoso on 16/7/17.
 */
public class MainClass {
    public static void factoryCalling (CycleFactories cycFact) {
        Cycle1 cycle=cycFact.getCycle();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        UniCycleFactory uniFact=new UniCycleFactory();
        BiCycleFactory biFact=new BiCycleFactory();
        TriCycleFactory triFact=new TriCycleFactory();
        factoryCalling(uniFact);
        factoryCalling(biFact);
        factoryCalling(triFact);
    }
}
