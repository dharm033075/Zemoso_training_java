package java_assignment_4;

import kycFormdate.datevalidator;
import nestingInterface.A;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.GregorianCalendar;

/**
 * Created by zemoso on 8/7/17.
 */

public class kycFormDatewindow {

    /**<h1>KYCFormDateRange</h1>
     * <p> this method perform the  task to find the range or window for kyc form filling</p>
     * @param signupDate this is in dd-MM-yyyy format
     * @param currentDate this is in dd-MM-yyyy format
     *
     */
    public static boolean KYCFormDateRange(Date signupDate,Date currentDate) {
        GregorianCalendar gcSignup = new GregorianCalendar();
        GregorianCalendar gcCurrent = new GregorianCalendar();
        boolean returntype=false;

        gcSignup.setTime(signupDate);
        gcCurrent.setTime(currentDate);
           SimpleDateFormat input_1 = new SimpleDateFormat("dd-MM-yyyy");
            gcSignup.set(Calendar.YEAR, gcCurrent.get(Calendar.YEAR));
            System.out.println(input_1.format(gcSignup.getTime()));
            gcSignup.add(Calendar.DAY_OF_MONTH, -30);
            Date startingDateOfWindow = gcSignup.getTime();
            gcSignup.add(Calendar.DAY_OF_MONTH, 60);
            Date endDateOfWindow = gcSignup.getTime();

            /**
             * @param startingDateOfWindow this is 30 days before the signup date
             * @param endDateOfWindow this is 30 days after the signup date
             */
            if (startingDateOfWindow.after(currentDate) || startingDateOfWindow.equals(currentDate)) {
                System.out.println("Not in Range");
                returntype=false;
            } else if (startingDateOfWindow.before(currentDate) && endDateOfWindow.after(currentDate)) {
                System.out.println("The Date Window for form is: " + input_1.format(startingDateOfWindow) + " " + input_1.format(currentDate));
                returntype=true;
            } else {
                System.out.println("The Date Window for form is: " + input_1.format(startingDateOfWindow) + " " + input_1.format(endDateOfWindow));
                returntype=true;
            }
            return returntype;
    }


    public static void main(String[] args){

        String dateFormate,signupdate,currentdate;
        Scanner sc=new Scanner(System.in);
        datevalidator dv=new datevalidator();
        System.out.println("In which format do you want to enter dates. \nEnter 1 for dd-MM-yyyy or enter any other for dd/MM/yyyy format  ");
        int dateInputChoice=sc.nextInt();
        /**
         * below choice of user checked that user want to give date in which format
         *
         */
        if(dateInputChoice==1){
            dateFormate="dd-MM-yyyy";
            System.out.println("Enter the signup date in order dd-MM-yyyy format");
            signupdate=sc.next();
            dv.isTheDateValid(signupdate,dateFormate);
            System.out.println("Enter the current date in order dd-MM-yyyy format");
            currentdate=sc.next();
            dv.isTheDateValid(currentdate,dateFormate);

        }else{
            System.out.println("Enter the signup date in order dd/MM/yyyy format");
            signupdate=sc.next();
            dateFormate="dd/MM/yyyy";
            dv.isTheDateValid(signupdate,dateFormate);
            System.out.println("Enter the current date in order dd/MM/yyyy format");
            currentdate=sc.next();
            dv.isTheDateValid(currentdate,dateFormate);

        }
        try{
            SimpleDateFormat input_1=new SimpleDateFormat(dateFormate);
            Date signupDate=input_1.parse(signupdate);
            Date currentDate=input_1.parse(currentdate);
            /**
             * function KYCFormDateRange is called with two parameters. function will print the date window
             *
             */
            KYCFormDateRange(signupDate,currentDate);

        }catch(ParseException e){
            System.out.println("Sorry couldn't parsed which you entered");
        }finally{
            System.out.println();

            System.out.println("if error, Please Enter the signup date in dd-MM-yyyy or dd/MM/yyyy format ");
        }

    }

}
