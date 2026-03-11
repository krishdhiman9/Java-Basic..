package javaPracQuestion;
import java.util.Scanner;

public class studentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks " );
        int marks = sc.nextInt();
        //System.out.println("enter marks" );

        if (marks >= 40){
            System.out.println("pass" );
        }
        else {
            System.out.println("fail");
        }
    }
}
