package dharm.assignment.main;

import dharm.assignment.dharm.assignment.data.hello_class;
import dharm.assignment.singleton.singleton;

/**
 * Created by zemoso on 26/6/17.
 */
public class main1 {
    public static void main(String[] args){
        hello_class fir=new hello_class();
        fir.printthe();
        /*fir.printra();*/
        singleton sec=singleton.method1("dharmraj_ra");
        sec.printing(sec);
    }
}
