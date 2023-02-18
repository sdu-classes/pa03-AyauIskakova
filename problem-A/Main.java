import java.util.Scanner; 
public class Main { 
    public static void main(String[] args) throws NumberFormatException{ 
        Scanner scan  = new Scanner(System.in); 
        try{ 
            int a = scan.nextInt(); 
            int b = scan.nextInt(); 
            Calculator obj1 = new Calculator(a, b); 
            Calculator obj2 = new Calculator(a, b); 
            Calculator obj3 = new Calculator(a, b); 
            Calculator obj4 = new Calculator(a, b); 
            System.out.println("Addition:" + obj1.Add()); 
            System.out.println("Substraction:" + obj2.Substract()); 
            System.out.println("Multiplication" + obj3.Multiplication()); 
            System.out.println("Division :" + obj4.Division()); 
        } 
        catch(NumberFormatException n){ 
            System.out.println("Please write in integer"); 
        } 
 
    } 
}
