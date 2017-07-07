package new_file;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

/**
 * Created by zemoso on 28/6/17.
 */
public class vampire_number {
    List<Integer>x=new ArrayList<>(); //List declaration for storing vampire number in outer loops
    List<Integer>u=new ArrayList<>(); //List declaration for storing vampire number in inner1 loops

    //function which return list of vampire numbers
    public List<Integer> vampire_number1(){
        int i=4;
        // while loop with condition of list of vampire number not more than 100
        outer:
        while(x.size()<=100){
            int n=i/2;

            for(int j=(int)(Math.pow(10,i-1)+1);j<=(int)(Math.pow(10,i)-1);j++){

                x=factor(j,n);
                if(x.size()>=100){
                    break outer;     //break label for break the both loops and reach to label
                }
            }
         //  System.out.println(x.toString());
            i=i+2; //for even digit values i=4,6,8,10,12...
        }
        System.out.println(x.size());
        return  x; //returning list of vampire number

    }
    /**ismatching function check if the two same digit factors matches with it's multiplication
    in terms of digit like 21 and 60 it will check if it matches with digit of 1260 and return in boolean
    */
    public boolean ismatching(int s, int k, int h){
        List<Integer> w=arraycon(s,k,h);
        List<Integer> v=arraycon(s*k,h);
        int [] asd=new int[10];
        int count2=0;
        for(int o:w) {
            asd[o] = asd[o] + 1;
        }
        for(int r:v){
                if(asd[r]>0) {
                    asd[r]=asd[r]-1;
                }
         }
         int sum=0;
         for(int sd=0;sd<10;sd++){
            sum=sum+asd[sd];
         }
       if(sum==0){
//            System.out.println("it's vampire");
            return true;
       }
       else
           return false;
    }
     //this factor function return the list by adding  the vampire digit
    public List<Integer> factor(int number, int digits){
        /** below getting all the factors lying with same digit number like in 4 digit number we will get two digit factors
        of this number. for 6 all factors with 3 digit we found
        */
        int xt=0;
        for(int l=(int)(Math.pow(10,digits-1)+1);l<=(int)(Math.pow(10,digits)-1);l++){
            int rem,p;
            rem=number%l;
            if(rem==0){
                p=l;
                 if(isdigit(number/p,digits)){
                    if(ismatching(p,number/p,digits)){
                         u.add(number);
                         break;
                   }

                }
            }
        }
        return u;
    }
    //arraycon function convert two factors digits into array of all the digit of these two factors
    public List<Integer> arraycon(int s, int k, int h){
        int rem;List<Integer> p= new ArrayList<>();
        //System.out.println(p.toString());
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
    //this makes the list of digits of a number
    public List<Integer> arraycon(int s, int h){
        int rem; List<Integer> q= new ArrayList<>();
        while(s>0){
            rem=s%10;
            s=s/10;
            q.add(rem);
        }
        return q;
    }
    /**isdigit function check if the second factor of a number have the number of digits
     *  in it is half of the number's digit example like 4 digit number 1260 (factors 21,60)
     *  it will check the second factor(60) have the digit(4/2) 2 in it and return boolean
     */
     public boolean isdigit(int fac2, int digits){
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
        vampire_number t1= new vampire_number();
        t1.printvampnum(t1.vampire_number1());//print 100 the vampire numbers
    }

}
