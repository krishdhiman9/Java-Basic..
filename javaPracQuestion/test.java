package javaPracQuestion;
//import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
    //int day = 3;
//        Scanner sc = new Scanner(System.in);
//        //System.out.println("enter day ");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("Invalid day");
    //    }
    //  }

//public class test{
//    public static void main(String [] args) {
//        int num = 1;
//        for(int i = 1; i <= 4; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print(num);
//            }
//            System.out.println();
//        }
//    }
//}