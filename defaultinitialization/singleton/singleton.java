package dharm.assignment.singleton;

/**
 * Created by zemoso on 26/6/17.
 */
public class singleton {
    String g;

    public static singleton method1(String str){
        singleton t=new singleton();
        t.g=str;
        return t;
    }
    public static void printing(singleton t){
        System.out.println(t.g);
    }
    public static void main(String[] args){
        singleton m=new singleton().method1("rahul");
        m.printing(m);
    }

}
