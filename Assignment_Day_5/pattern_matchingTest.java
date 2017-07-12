package Assignment_5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 12/7/17.
 */
public class pattern_matchingTest {
    @Test
    public void firsttestcase(){
        assertTrue(pattern_matching.regexmatch("Asfjlkjskldfjl saflkj qwer jkls."));
    }
    @Test
    public void secondtestcase(){
        assertFalse(pattern_matching.regexmatch("asfjlkjskldfjl saflkj qwer jkls."));
    }


}