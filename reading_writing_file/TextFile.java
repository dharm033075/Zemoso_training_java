package reading_writing_file;

import java.io.*;
import java.util.*;
import java.util.Iterator.*;
import java.io.*;
import java.util.Map;

/**
 * Created by zemoso on 4/7/17.
 */
public class TextFile extends ArrayList<String> {
    //Reading a file as string
    public static Map<Character, Integer> read(String filename, String filew){
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer>mp=new HashMap<Character,Integer>();
        int numberofrecords=0;

        try{
            BufferedReader in=new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try{
                int s;



                /*System.out.println(mp.get('r'));
                */
                //System.out.println(mp.get('r'));



                while((s=in.read())!=-1){
                    char z=(char) s;
                    numberofrecords++;
                    sb.append(z);
                    sb.append("\n");
                    if(mp.containsKey(z)){
                        mp.put(z,mp.get(z)+1);
                    }else{
                        mp.put(z,1);
                    }

                }

            }finally{
                in.close();
            }

            FileWriter fw=new FileWriter(filew);
            BufferedWriter bw=new BufferedWriter(fw);
            //initialize the counter of records
            int count=0;
            //making an iterator for the map
            Iterator<Map.Entry<Character,Integer>> it=mp.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<Character,Integer>Pairs=it.next();
                System.out.println(Pairs.getKey()+"|"+Pairs.getValue());
                bw.write(Pairs.getKey()+Pairs.getValue()+" \n");
            }
            System.out.println("total entries:"+ numberofrecords);
            bw.close();


            }catch(Exception e){
             throw new RuntimeException();
        }


        return mp;

    }
    public static void write(String filename, String txt){
        try {
            PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
            try{
                out.write(txt);
            }finally {
                out.close();
            }
        }catch(Exception e){
            throw new RuntimeException();
        }

    }

}
