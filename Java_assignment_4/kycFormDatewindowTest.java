package java_assignment_4;

import jdk.internal.util.xml.impl.Pair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 11/7/17.
 */
public class kycFormDatewindowTest {
    private kycFormDatewindow kycformdatewindow;
    private dateValidator dv;
    @Before
    public void init(){
        dateValidator dv=new dateValidator();
        kycformdatewindow=new kycFormDatewindow();

    }

    @Test
    public void firsttestcase(){
        try{
            SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
            assertTrue(kycformdatewindow.KYCFormDateRange(sfd.parse("16-07-1998"),sfd.parse("27-06-2017")));

        }catch(ParseException e){
            System.out.println("coudn't parsed");
        }

    }
    @Test
    public void secondtestcase(){
        try{
            SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
            assertTrue(kycformdatewindow.KYCFormDateRange(sfd.parse("13-02-1998"),sfd.parse("27-06-2017")));

        }catch(ParseException e){
            System.out.println("coudn't parsed");
        }

    }
    @Test
    public void thirdtestcase(){
        try{
            SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
            assertTrue(kycformdatewindow.KYCFormDateRange(sfd.parse("04-02-2016"),sfd.parse("04-04-2017")));

        }catch(ParseException e){
            System.out.println("coudn't parsed");
        }

    }
    @Test
    public void fourthtestcase(){
        try{
            SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
            assertFalse(kycformdatewindow.KYCFormDateRange(sfd.parse("04-05-2017"),sfd.parse("04-04-2017")));

        }catch(ParseException e){
            System.out.println("coudn't parsed");
        }

    }
    @Test
    public void fifthtestcase(){
        try{
            SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
            assertTrue(kycformdatewindow.KYCFormDateRange(sfd.parse("04-04-2015"),sfd.parse("04-04-2016")));

        }catch(ParseException e){
            System.out.println("coudn't parsed");
        }

    }
    @Test
    public void sixTestcase(){
        try{
            SimpleDateFormat sfd=new SimpleDateFormat("dd-MM-yyyy");
            assertTrue(kycformdatewindow.KYCFormDateRange(sfd.parse("05-03-2016"),sfd.parse("15-03-2016")));

        }catch(ParseException e){
            System.out.println("coudn't parsed");
        }

    }
    @Test
    public void invalidDateTestcase(){
       assertFalse(dateValidator.isTheDateValid("16-25-2017","dd-MM-yyyy"));

    }

}