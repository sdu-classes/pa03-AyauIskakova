import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) throws NumberFormatException{ 
        Scanner scan  = new Scanner(System.in); 
        try{ 
            int c = scan.nextInt(); 
            int d = scan.nextInt(); 
            Calculator obj1 = new Calculator(c, d); 
            Calculator obj2 = new Calculator(c, d);
             Calculator obj3 = new Calculator(c, d);
              Calculator obj4 = new Calculator(c, d);
            System.out.println("Addition:" + obj1.Add()); 
            System.out.println("Substraction:" + obj2.Substract()); 
            System.out.println("Multiplication" + obj3.Multiplication()); 
            System.out.println("Division :" + obj4.Division()); 
        } 
        catch(NumberFormatException n){ 
            System.out.println("write in integer"); 
        } 
 
    } 
}
