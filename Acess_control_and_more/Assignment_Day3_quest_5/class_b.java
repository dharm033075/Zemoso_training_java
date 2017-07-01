package Assignment_3_quest_5;

/**
 * Created by zemoso on 1/7/17.
 */
public class class_b extends class_a.class_a1{
   class_b(class_a f1,int z){
     f1.super(z);
   }
   public void ra(){
           System.out.println("this is inheriated from first in second and overridden while we inherit first inner class from class_b");

   }
   public static void main(String[] args){
       class_a f1= new class_a();
       class_b gf=new class_b(f1,6);
       gf.ra();
       class_c c1=new class_c();
       class_c.class_a1 c1_a1=c1.new class_a1(f1);
       c1_a1.ra();
   }
}
