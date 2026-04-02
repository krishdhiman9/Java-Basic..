package dsaQ;
import javaPracQuestion.claculator;
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a, int b ){
        return a*b;
    }
    int div(int a ,int b){
        return a/b;
    }  
}
public class simpleCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("addition = " + c.sum(3,4));
        System.out.println("subtraction = " + c.sub(3,3));
        System.out.println("multiplication = " + c.mul(10,5));
        System.out.println("division = " + c.div(10,5));
        
    }
    
}
