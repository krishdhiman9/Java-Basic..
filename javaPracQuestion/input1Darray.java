package javaPracQuestion;
import java.util.Scanner;
public class input1Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] arr = new int [5];
        System.out.println("enter elements");
        int find = 3;
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("1d array");
        for(int i= 0;i<arr.length;i++){
            System.out.print( arr[i] + " ");
        }
        
        for(int i=0;i<=arr.length;i++){
            if(find==arr[i]){
            System.out.println( "(" + find + " found"+ ")");
            break;
            }
            
        }

    }
    
    
}
