package Assignment_3_question_3;

/**
 * Created by zemoso on 30/6/17.
 */
public class concerete_class {

    public static void t(Interface1 d){d.speak_1();d.write_1();}
    public static void v(Interface2 e){e.speak_2();e.write_2();}
    public static void q(Interface3 f){f.speak_3();f.write_3();}
    public static void r(Interface4 g){g.walk();}

    public static void main(String[] args) {
            Interface4 nc =new New_class();
           t(nc);
           v(nc);
           q(nc);
           r(nc);




    }
}
