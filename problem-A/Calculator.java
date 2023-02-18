public class Calculator { 
    private int a; 
    private int b; 
public Calculator(int a, int b){ 
    this.a = a; 
    this.b = b; 
} 
public int Add()throws ArithmeticException{ 
    if(this.a <0 || this.b <0 ){ 
        throw new ArithmeticException("Don't write negative number"); 
    } 
    return a +b; 
} 
public int Substract() throws ArithmeticException{ 
    if(this.a < 0 || this.b < 0 ){ 
        throw new ArithmeticException("Don't write negative number"); 
    } 
    return a - b ; 
} 
public int Multiplication() throws ArithmeticException{ 
    if(this.a == 0 || this.b==0){ 
        throw new ArithmeticException("Don't write zero"); 
    } 
    return a * b; 
} 
public int Division() throws ArithmeticException{ 
    if(this.a ==0 || this.b == 0){ 
        throw new  ArithmeticException("Don't write zero"); 
    } 
    return a/b; 
} 
}
