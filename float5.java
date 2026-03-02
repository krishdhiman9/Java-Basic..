/*public class float5 {
    public static void main(String[] args) {
        
        float[] n= new float[5];
        n [0]=2.1f;
        n [1]=2.2f;
        n [2]=2.3f;
        n [3]=2.4f;
        n [4]=2.5f;

        float sum=n [0]+n [1]+ n[2]+n [3]+n [4];
        System.out.println(sum);

    }
    
}*/

import java.util.Scanner; 
public class float5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int number= sc.nextInt();

        int[] n = {10, 20, 30};
        if (number==n[0] || number==n[1] || number==n[2]) {
            System.out.println("we found a number in this array" );
        }
        else{
            System.out.println("not found the number in array");
        }
    }
 }