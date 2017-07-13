package PingAnIP;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 13/7/17.
 */
public class PingTest {
    @Test
    public void IpTest(){
        assertTrue(Ping.getAVGrtt("8.8.8.8",1));
    }
    @Test
    public void domainTest()throws IOException{}{
        assertTrue(Ping.getAVGrtt("google.com",2));
    }
    @Test
    public void randomInputTest()throws IOException{}{
        assertFalse(Ping.getAVGrtt("asfd4553242123$#.com",2));
    }

}