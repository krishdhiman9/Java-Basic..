import java.util.Scanner;
public class sumEven {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while (i <=n ){
            sum = sum +(2 * i);
            i++;
        }
        System.out.println(sum);
    }
}