package Operators_assignment_Day_2;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zemoso on 28/6/17.
 */
public class Vampirenumber {
    List<Integer>listOuter=new ArrayList<>(); //List declaration for storing vampire number in outer loops
    List<Integer>listInner=new ArrayList<>(); //List declaration for storing vampire number in inner1 loops
    public List<Integer> vampireNumbers( int howManyVampireNumbers){
        int digitsInNumber=4;
        // while loop with condition of list of vampire number not more than 100
        outer:
        while(listOuter.size()<=howManyVampireNumbers){
            int digitsInFactors=digitsInNumber/2;
            for(int j=(int)(Math.pow(10,digitsInNumber-1)+1);j<=(int)(Math.pow(10,digitsInNumber)-1);j++){
                listOuter=factor(j,digitsInFactors);
                if(listOuter.size()>=100){
                    break outer;     //break label for break the both loops and reach to label
                }
            }
           digitsInNumber=digitsInNumber+2; //for even digit values i=4,6,8,10,12...
        }
        return  listOuter; //returning list of vampire number
    }
    //ismatching function check if the two same digit factors matches with it's multiplication

    /**
     *
     * @param s factor 1 of number
     * @param k factor 2 of number
     * @param h digits in number
     * @returnin terms of digit like 21 and 60 it will check if it matches with digit of 1260
     * and return in boolean
     */
    public boolean isMatching(int s, int k, int h){
        List<Integer> listOfDigitsOftwoFactors=convertNumbToArrayOfDigits(s,k,h);
        List<Integer> listOfDigitOfNumber=convertNumbToArrayOfDigits(s*k,h);
        int [] arrayToCheck=new int[10];
        for(int o:listOfDigitsOftwoFactors) {
            arrayToCheck[o] = arrayToCheck[o] + 1;
        }
        for(int r:listOfDigitOfNumber){
                if(arrayToCheck[r]>0) {
                    arrayToCheck[r]=arrayToCheck[r]-1;
                }
         }
         int sum=0;
         for(int sd=0;sd<10;sd++){
            sum=sum+arrayToCheck[sd];
         }
       if(sum==0){
            return true;
       }
       else
           return false;
    }

    /**
     *
     * @param number:Integer number
     * @param digits half of the digits of the number digit
     * @return List containing the factors of number (which have half digits of the number)
     */
    public List<Integer> factor(int number, int digits){
       int xt=0;
        for(int l=(int)(Math.pow(10,digits-1)+1);l<=(int)(Math.pow(10,digits)-1);l++){
            int rem,p;
            rem=number%l;
            if(rem==0){
                p=l;
                 if(isDigit(number/p,digits)){
                    if(isMatching(p,number/p,digits)){
                         listInner.add(number);
                         break;
                   }

                }


            }

        }
        return listInner;
    }
    /**
     *   @param s factor 1 oif a number
     *   @param k factor 2 of a number
     *   @param h number of digit in factors
     *   @return List containing all the digits of both factors
     */
   public List<Integer> convertNumbToArrayOfDigits(int s, int k, int h){
        int rem;List<Integer> p= new ArrayList<>();
         while(s>0){
            rem=s%10;
            s=s/10;
            p.add(rem);
        }
        while(k>0){
            rem=k%10;
            k=k/10;
            p.add(rem);
        }
        return p;
    }
    /**
     *
     * @param s even digit number
     * @param h number of digit in number
     * @return List containing all the digit of a number
     */
    public List<Integer> convertNumbToArrayOfDigits(int s, int h){
        int rem; List<Integer> q= new ArrayList<>();
        while(s>0){
            rem=s%10;
            s=s/10;
            q.add(rem);
        }
        return q;
    }
    /**
     *  isdigit function check if the second factor of a number have
     *  the half number of digits
     *   example like 4 digit number 1260 (factors 21,60) it will check the
     *   second factor(60) have the digit(4/2) 2 in it and return boolean
     *  @param fac2 second factor of number
     *  @param digits digits in number
     *  return boolean check the second factor of a number have the half number of digits
     *  */
  public boolean isDigit(int fac2, int digits){
        int count=0;
        while(fac2>0){
            fac2=fac2/10;
            count++;
        }
        if(count==digits){
            return true;
        }
        else{
            return false;
        }
    }
    public void printvampnum(List<Integer> z){
        System.out.println(z.toString());
    }
    public static void main(String[] args){
        Vampirenumber t1= new Vampirenumber();
        t1.printvampnum(t1.vampireNumbers(100));
    }

}
