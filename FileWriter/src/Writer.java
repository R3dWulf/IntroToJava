import java.io.FileWriter;
import java.util.Scanner;

public class Writer {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                FileWriter fw = null;
                
                //Try opening file
                try {
                        fw = new FileWriter("my_file.txt");
                }catch(Exception e){
                        System.out.println("Error opening file!");
                        e.printStackTrace();
                }
                System.out.println("Enter lines to write to the file. Enter on empty line to finish.");
                String line = scan.nextLine();
                
                //Try writing to file
                try {
                        if(fw !=  null) {
                                while( !line.equals("") ) {
                                        line = scan.nextLine();
                                        fw.write(line + "\r");
                                       
                                }
                                fw.close();
                        }
                }catch(Exception e) {
                        System.out.println("Error wring to file!");
                        e.printStackTrace();
                }
        }

}
