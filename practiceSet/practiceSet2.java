package practiceSet;

import java.util.Scanner;

public class practiceSet2 {
    public static void main(String[] args) {
        
        //1)..fololwing expression
        float x = 7/4*9/2;
        System.out.println(x);

        //2)..following expression
        double v = 2;
        double u = 3;
        double a = 4;
        double s = 5;
        double Calculate = (v*v - u*u) / (2*a*s);
        System.out.println(Calculate);

        //3)..A number is greater than the user entered number or not
        int number = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = sc.nextInt();

        if (number > userNumber)
            System.out.println(number + "is greater than " + userNumber);
        else
            System.out.println(number + "is not greater than " + userNumber);

    }

}
