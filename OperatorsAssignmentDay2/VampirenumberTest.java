package OperatorsAssignmentDay2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by zemoso on 12/7/17.
 */
public class VampirenumberTest {
    @Test
    public void isMatchingtest(){
        int x=21,y=60,z=4;
        assertTrue(new Vampirenumber().isMatching(x,y,z));
    }
    @Test
    public void isDigitTest(){
        assertTrue(new Vampirenumber().isDigit(60,2));
    }

    @Test
    public void vampNumTest(){
      Integer[]t=new Vampirenumber().vampireNumbers(4).toArray(new Integer[0]);
        assertArrayEquals(new Integer[]{1260,1395,1435,1530,1827,2187,6880},t);
    }


}