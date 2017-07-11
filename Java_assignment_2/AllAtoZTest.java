package Java_assignment_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 11/7/17.
 */
public class AllAtoZTest {
    @Before
    public void init(){
        AllAtoZ az=new AllAtoZ();
    }
    @Test
    public void Test1(){
        AllAtoZ.stringHasAllaToz("rahldfl/!33213asdfjlkjaew");
    }
    @Test
    public void Test2(){
        AllAtoZ.stringHasAllaToz("asdfg12456 23#$%#@/,hjk l{;>?]mnbvcxz90qwrtyuiop");
    }


}