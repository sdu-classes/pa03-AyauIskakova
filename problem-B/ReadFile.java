import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
public class ReadFile { 
    public static String[] readFile(String princeFile) throws FileNotFoundException{ 
        String[] lines = new String[1000]; 
        int LineCounter = 0; 
        File file = new File(princeFile); 
        Scanner scan = new Scanner(file); 
        while(scan.hasNextLine()){ 
            String l = scan.nextLine(); 
            lines[LineCounter] = l; 
            LineCounter++; 
        } 
        scan.close(); 
        return lines; 
    } 
 
}
