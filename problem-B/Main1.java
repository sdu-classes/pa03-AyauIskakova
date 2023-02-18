import java.io.FileNotFoundException; 
import java.util.Scanner; 
public class Main1 { 
    public static void main(String[]args){ 
        Scanner scan = new Scanner(System.in); 
        try{ 
            System.out.println("Write file name :"); 
            String s = scan.next(); 
            String[] des = ReadFile.readFile(s); 
            for (int i = 0; i < des.length; i++) { 
                if(des[i] == null){ 
                    break; 
                } 
                System.out.println("[" + i + "]" + des[i]); 
 
            } 
            scan.close(); 
        } 
        catch(FileNotFoundException f){ 
            f.printStackTrace(); 
        } 
    } 
 
} 
