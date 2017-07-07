package Assignment_3;

import java.util.Random;

/**
 * Created by zemoso on 30/6/17.
 */

public class Main_class {
    public static void main(String[] args){
        Rodent[] rd=new Rodent[3];
        rd[0]=new Gerbil();
        rd[1]=new Hamster();
        rd[2]=new mouse();
        for(int i=0;i<3;i++){
             rd[i].size();
             rd[i].teethnumber();
        }

    }
}
