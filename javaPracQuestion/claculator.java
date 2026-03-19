package javaPracQuestion;
import java .util.Scanner;


public class claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter operator: ");
        char c = sc.next().charAt(0);
        //int c = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();
        //int result=0;


        switch (c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                
                break;
            case '/':
                //result=a/b;
                break;
            case '%':
                //result=a%b;
                break;
            }
        //System.out.println("your answer is: " + result);
    }
    
}
