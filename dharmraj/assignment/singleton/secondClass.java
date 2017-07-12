package dharmraj.assignment.singleton;

/**
 * Created by zemoso on 12/7/17.
 */
public class secondClass {
    String member;
    public static secondClass staticMethod(String Member){
        /**
         * A non static member can't be called from a static method
         */
        //member=Member;
        return new secondClass();
    }
    public void printMember(){
        secondClass classObject=staticMethod("dharmraj");
        System.out.println(classObject.member);
    }
    public static void main(String[] args){

    }



}
