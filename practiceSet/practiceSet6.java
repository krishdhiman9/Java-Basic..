package practiceSet;

import java.util.Scanner;

public class practiceSet6 {
    public static void main(String[] args) {
        //1)..Sum of 5 float numbers.
        float[] n= new float[5];
        n [0]=2.1f;
        n [1]=2.2f;
        n [2]=2.3f;
        n [3]=2.4f;
        n [4]=2.5f;

        float sum=n [0]+n [1]+ n[2]+n [3]+n [4];
        System.out.println(sum);

        //2)..A program to find whether a given integer is present in an array or not.
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Number is present in array");
        } else {
            System.out.println("Number is not present in array");
        }


        //3)..Reverse an array
        int[] array={22, 33, 44, 55, 66};
        
        for(int i=n.length-1; i>=0; i--){
            System.out.print(array[i] + ",");
        }

        //3)..Maximum element in array.
        int[] arry ={88,4,699,99,8};
        int max=arry[0];

        for(int i=0; i<arry.length; i++){
            if (arry[i]<max) {
                max=arry[i];
            }
        }
            System.out.println(max);
        

        //4)..Minimum element in array.
        int ary[] = {12, 5, 8, 2, 15};

        int min = ary[0];

        for(int i = 1; i < ary.length; i++){
            if(ary[i] < min){
                min = ary[i];
            }
        }

        System.out.println("Minimum element = " + min);

        //5)..Array is sorted or not..
        int ar[] = {1, 3, 5, 7, 9};

        boolean isSorted = true;

        for(int i = 0; i < ar.length - 1; i++){
            if(ar[i] > ar[i + 1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
    
}
