import java.util.Scanner;
public class passFail{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter marks of subject first: ");
        float m1 = sc.nextFloat();

        System.out.println("enter marks of subject second: ");
        float m2 = sc.nextFloat();

        System.out.println("enter marks of subject third: ");
        float m3 = sc.nextFloat();

        float total = m1 + m2 + m3;
        float percentage = (total / 300.0f) * 100;
        System.out.println(percentage);
        
        if ( m1 >= 33 && m2 >= 33 && m3 >= 33 && percentage >= 40)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
}
