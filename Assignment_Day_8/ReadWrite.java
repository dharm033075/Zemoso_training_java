package reading_writing_file;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

    /**
     * Created by zemoso on 4/7/17.
     */
    public class ReadWrite extends ArrayList<String> {
        /**
         *
         * @param fileToRead file whcih to be read
         * @param fileToWrite file in which result to be written
         * @return Has map containing char and its freq in file
         */
        public static Map<Character, Integer> readFromFileAndWrite(String fileToRead,String fileToWrite){
            StringBuilder sb=new StringBuilder();
            Map<Character,Integer> mapStoredFromFileInput=new HashMap<>();
            int numberOfRecordsInMap=0;
            try{
                BufferedReader in=new BufferedReader(new FileReader(new File(fileToRead).getAbsoluteFile()));
                PrintWriter PW=new PrintWriter(new File(fileToWrite).getAbsoluteFile());
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
                    Iterator<Map.Entry<Character,Integer>> it=mapStoredFromFileInput.entrySet().iterator();
                     while(it.hasNext()){
                         Map.Entry<Character,Integer>Pairs=it.next();
                         PW.write(Pairs.getKey());
                         PW.write("   "+Pairs.getValue()+"\n");
                    }
                    PW.write(numberOfRecordsInMap+" : Total number of Items wrote in file");
                }finally{
                    in.close();
                    PW.close();
                }

            }catch(IOException |ArrayIndexOutOfBoundsException | InputMismatchException e){
                System.out.println("file not in system");
            }
            return mapStoredFromFileInput;
        }
    }


