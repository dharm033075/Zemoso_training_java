package new_file;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

/**
 * Created by zemoso on 29/6/17.
 */
public class operators_ass_3 {
    operators_ass_3[] array1; //decalred operators_ass_3 class type array only for referenced
    public operators_ass_3(String s){
        System.out.println(s);

    }

    public static void main(String[] args){

        operators_ass_3 b= new operators_ass_3("dharm");
        b.array1=new operators_ass_3[5];//initialization of the array1 to class objects


    }
}