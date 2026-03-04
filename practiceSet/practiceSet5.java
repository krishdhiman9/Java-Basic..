package practiceSet;

import java.util.Scanner;

public class practiceSet5 {
    public static void main(String[] args) {
        //1)..Print **** pattern
        for(int i=5; i!=1; i--){
            for(int j=1; j<=i; j++){
         System.out.println("*");
        }
    }

        //2)..Sum of first n even natural numbers using while loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: " );
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <=n ){
            sum = sum +(2 * i);
            i++;
        }
        System.out.println(sum +" sum");

        //3)..Multiplication table
        System.out.print("enter number: ");
        int number = sc.nextInt();
        for(int table=1; table<=10; table++){
            System.out.println(number + "x" + table +"=" + (number * table) );
        }
        

        //4)..factorial of any given number.
        System.out.print("enter number: ");
        int number1 = sc.nextInt();
        int fact = 1;

        for( int a = 1; a<=number1; a++ ){
            fact= fact * a;
        }
        System.out.println(fact);

        //5)..Repeat 5 using while loop.
         int num = 5;
        int repeat=1;
        while(repeat<=5){
            System.out.println(num);
            repeat++;
        }

        //6).. Repeat 2 using for loop.
        
        int Repeat=2;
        for(int b = 1; b<=5; b++){
        System.out.println(Repeat);
        }
    
    }
}

    
    

