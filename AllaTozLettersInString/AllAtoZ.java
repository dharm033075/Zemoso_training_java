package Java_assignment_2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zemoso on 5/7/17.
 */
public class AllAtoZ {

    public static void stringHasAllaToz(String inputstring){
        String[] arrayInputstring = inputstring.split("");
        Map<String,Integer>map=new HashMap<>();
        //System.out.println(Arrays.toString(str2));
        //System.out.println(Arrays.toString(Pattern.compile("").split(str)));
        /**
         * <p>below given loop is Separating the string in characters and also loading the characters into map
         * which belong to [a-zA-z] category. </p>
         */
        for(String s: arrayInputstring ){
            //System.out.println(s);
            if(s==" "){
                continue;
            }else{
                if(map.containsKey(s)){
                    continue;

                }else{
                    s=s.toLowerCase();
                    if(s.matches("[a-zA-z]")){

                        map.put(s,1);                    }
                }

            }
        }
        /**
         *<p> below code sums the all characters value mapped in map while we gave every a-z character 1 in map.
         * so when it equals to 26 it means all the characters of string hav all a-z characters</p>
         */
        int sum=0; //this sum will be sum of all from a-z while each value is 1 so basically we are summing and will
        //check if it equals 26 or not
        Iterator<Map.Entry<String, Integer>>it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer>keyvalue=it.next();
            sum=sum+keyvalue.getValue();
            //System.out.println(keyvalue.getKey()+keyvalue.getValue());

        }
        if(sum==26){
            System.out.println("it has all the a-z letters of alphabet");


        }else{
            System.out.println("The input String don't have all a-z letters "+ "it have only "+(sum)+ " letters");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        /**
         * <p>function stringHasAllaToz function take the inputString and as output it prints that given
         * string has all alphabetical letter or not </p>
         * @param inputString: String that will checked if it has all the letter from a-z or not
         */
        stringHasAllaToz(inputString);


    }

}
