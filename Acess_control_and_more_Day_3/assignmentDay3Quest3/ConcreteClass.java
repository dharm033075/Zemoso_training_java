package Acess_control_and_more_Day_3.assignmentDay3Quest3;

/**
 * Created by zemoso on 30/6/17.
 */
public class ConcreteClass {

    public static void firstInterfaceMethod(Interface1 d) {
                  d.speak_1();
                  d.write_1();
    }

    public static void secondInterfaceMethod(Interface2 e) {
                  e.speak_2();
                  e.write_2();
    }

    public static void thirdInterfaceMethod(Interface3 f) {
                  f.speak_3();
                  f.write_3();
    }

    public static void fourthInterfaceMehtod(Interface4 g) {
                  g.walk();
    }

    public static void main(String[] args) {

        Interface4 nc =new NewClass();

        firstInterfaceMethod(nc);
        secondInterfaceMethod(nc);
        thirdInterfaceMethod(nc);
        fourthInterfaceMehtod(nc);
    }
}
