package Basics;

import java.util.Scanner;

public class arrayBasics {
    public static void main(String[] args) {
        // arrays syntax:
int[] arr = {45,24,11,39};
int n = arr.length;
System.out.println(n);


// to print array all: for loop used*
// for(int i=0; i<=name.length; i++){
//     System.out.println(arr[i]);
// }

// Print reverse an array 
String[] name = {"krish", "rahul", "sahil"};
for(int i =name.length-1; i>=0; i--){
    System.out.println(name[i]);
}

// Shopping cart program
        Scanner sc = new Scanner(System.in);
String item;
double price;
int quantity;
char currency;
double total;
        System.out.print(" What would you like to Buy: ");
item = sc.nextLine();

        System.out.print("What would you like to Buy: ");
item = sc.nextLine();

        System.out.print("What is price for each?: ");
        price = sc.nextDouble();

        System.out.println("How many want to buy?: ");
        quantity = sc.nextInt();

        System.out.println("Your total bill is: "+ "$"+price*quantity);


// Multidimensional arrays
        int[][] flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1]= 105;
        flats[1][2]= 106;

        for(int g=0; g<flats.length; g++){
            for(int h=0; h<flats.length; h++){
                System.out.println(flats[g][h]);

            System.out.println(" ");}
        }


// printing all values in array with 2nd method
        String[] names = {"krish", "golu", "kd"};
        for(String namu: names){
            System.out.print(namu+" ");
        }

    }
}
