package Assignment_3_question_4;

/**
 * Created by zemoso on 1/7/17.
 */
public class final_class {
    public static void fact_use(cycle_factories t){
        Cycle z=t.getcycle();
        z.bicycle();
        z.tricycle();
        z.unicycle();
    }
    public static void main(String[] args){
        cycle_factories tx= new cyc_fact_impl();
        cycle_factories tc=new cyc_fact_impl2();
        fact_use(tx);
        fact_use(tc);
    }
}
