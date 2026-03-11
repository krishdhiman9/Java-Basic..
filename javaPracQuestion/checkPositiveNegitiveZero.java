package javaPracQuestion;
import java.util.Scanner;
public class checkPositiveNegitiveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number " );
        int num = sc.nextInt();

        //System.out.println("enter number " + num);

        if( num>0){
            System.out.println("positive number ");
        }

        else if(num<0){
            System.out.println("negitive number ");
        }

        else {
            System.out.println("number is zero");

        }
    }
}
