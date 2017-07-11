package java_assignment_4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zemoso on 10/7/17.
 */
public class dateValidator {
    /**
     * <p><h1>istheDateValid</h1> it's check the date's validity</p>
     * @param dateTovalidate user input date which to be checked if it is in right format
     * @param dateformat two formats are there dd-MM-yyyy or dd/MM/yyyy
     * @return true if date in given format else false
     */
    public static boolean isTheDateValid(String dateTovalidate,String dateformat){
        if(dateTovalidate==null){
            return false;
        }
        SimpleDateFormat sdf=new SimpleDateFormat(dateformat);
        sdf.setLenient(false);
        try{
            Date date=sdf.parse(dateTovalidate);
            System.out.println(date);

        }catch(java.text.ParseException e){
            System.out.println("your given date is not in format");
            return false;
        }
        return true;
    }
}
