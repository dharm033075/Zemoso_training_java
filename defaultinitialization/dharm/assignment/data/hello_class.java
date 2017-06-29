package dharm.assignment.dharm.assignment.data;

/**
 * Created by zemoso on 26/6/17.
 */
public class hello_class {
    int i;char j;
    public void printthe(){
        System.out.println(i);
        System.out.println(j);
    }
    /*public void printra(){
        int k; char l;
        System.out.println(k);
        System.out.println(l);

    }*/

    /**  java documentation:
     * @auther dharm
     * @version 4.0
     * @param args
     */
    public static void main (String[] args){
        hello_class t1= new hello_class();
        t1.printthe();
        /*t1.printra();*/
    }
}
