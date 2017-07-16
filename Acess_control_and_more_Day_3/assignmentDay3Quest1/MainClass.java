package Acess_control_and_more_Day_3.assignmentDay3Quest1;
/**
 * Created by zemoso on 30/6/17.
 */

public class MainClass {
    public static void main(String[] args){
        Rodent[] rd={new Gerbil(), new Hamster(), new Mouse()};

        for(int i=0; i<3; i++) {
             rd[i].size();
             rd[i].teethNumber();
        }
    }
}
