package practiceSet;

import java.util.Scanner;

public class praticeSet4 {
    public static void main(String[] args) {
        //1)..Day of week.
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a day; ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");
        
        }
                
        //2)..Pass or Fail
        
        
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
        
        //3)..Leap year or not
        System.out.println("enter a year: ");
        int year = sc.nextInt();
        
        if ((year % 400 == 0 || year % 4 == 0) && (year % 100 != 0))
            System.out.println("it is a leap year");
        else
            System.out.println("it is not a leap year");

        }
    }

