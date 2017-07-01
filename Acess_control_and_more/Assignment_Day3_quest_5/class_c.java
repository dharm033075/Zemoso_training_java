package Assignment_3_quest_5;

/**
 * Created by zemoso on 1/7/17.
 */
public class class_c extends class_a {

    public class class_a1 extends class_a.class_a1{
        public class_a1(class_a ga){
            ga.super(5);
        }

        public void ra(){
            System.out.println("this is from c class overridden method when we inherits the class_a from class_b then override the inner class of class_a");
        }
    }
}
