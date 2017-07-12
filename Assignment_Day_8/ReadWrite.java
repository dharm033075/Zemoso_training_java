package reading_writing_file;

import java.io.*;
import java.util.*;
import java.util.Map;

/**
 * Created by zemoso on 4/7/17.
 */
public class ReadWrite extends ArrayList<String> {
    //Reading a file as string
    public static Map<Character, Integer> readFromFile(String fileToRead){
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> mapStoredFromFileInput=new HashMap<>();
        int numberOfRecordsInMap=0;
        try{
            BufferedReader in=new BufferedReader(new FileReader(new File(fileToRead).getAbsoluteFile()));
            try{
                int s;
                while((s=in.read())!=-1){
                    char z=(char) s;
                    numberOfRecordsInMap++;
                    sb.append(z);
                    sb.append("\n");
                    if(mapStoredFromFileInput.containsKey(z)){
                        mapStoredFromFileInput.put(z,mapStoredFromFileInput.get(z)+1);
                    }else{
                        mapStoredFromFileInput.put(z,1);
                    }

                }

            }finally{
                in.close();
            }

            }catch(IOException e){
             System.out.println("file not in system");
        }
        Iterator<Map.Entry<Character,Integer>> it=mapStoredFromFileInput.entrySet().iterator();
            System.out.println("Key"+"  "+"Value");
            while(it.hasNext()){
            Map.Entry<Character,Integer>Pairs=it.next();
            System.out.println(Pairs.getKey()+"    "+Pairs.getValue());
        }
        System.out.println(numberOfRecordsInMap+": Total number of Items in map");
        return mapStoredFromFileInput;
    }
}
