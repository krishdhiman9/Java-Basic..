package javaPracQuestion;
import java .util.Scanner;


public class claculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter number 1,2,3,4: ");
        int c = sc.nextInt();
        System.out.print("enter 2nd number: ");
        int b = sc.nextInt();
        int result=0;


        switch (c){
            case 1:
                result=a+b;
                break;
            case 2:
                result=a-b;
                break;
            case 3:
                result=a*b;
                break;
            case 4:
                result=a/b;
                break;
            



        }
        System.out.println("your answer is: " + result);
    }
    
}
