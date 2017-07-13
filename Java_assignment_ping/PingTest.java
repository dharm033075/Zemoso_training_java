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
            try{assertTrue(Ping.getAVGrtt("8.8.8.8",1));}
            catch(IOException e) {
                System.out.println("Test failed");
            }
        }
        @Test
        public void domainTest(){
            try{assertTrue(Ping.getAVGrtt("google.com",2));}
            catch(IOException e) {
                System.out.println("Test failed");
            }
        }
        @Test
        public void randomInputTest(){
            try {assertFalse(Ping.getAVGrtt("asfd4553242123$#.com",2));}
            catch(IOException e) {
                System.out.println("Test failed");
            }

        }

  }
