import java.io.FileReader;
import java.io.BufferedReader;

public class Reader {
        public static void main(String[] args){
                try {
                       FileReader fr = new FileReader("my_file.txt");
                       BufferedReader br = new BufferedReader(fr);
                       
                       if(br != null) {
                               String line = br.readLine();
                               while(line != null) {
                                       System.out.println(line);
                                       line = br.readLine();
                               }
                       }
                }catch (Exception e) {
                        System.out.println("Error opening file!");
                        //e.printStackTrace();
                }
        }
}
