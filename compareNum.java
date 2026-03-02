import java.util.Scanner;
public class compareNum {
    public static void main(String[] args) {
        
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
