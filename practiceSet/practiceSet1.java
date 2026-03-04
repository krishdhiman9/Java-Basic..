package practiceSet;

public class practiceSet1 {
    public static void main(String[] args) {
        // 1)..Calculate cgpa
        int sub1 = 78;
        int sub2 = 79;
        int sub3 = 80;
        int sum = sub1+sub2+sub3; 
        int cgpa = (sum * 100) / 300;
        System.out.println(cgpa);
        
        //2)..Sum of three numbers
        int a = 1;
        int b = 2;
        int c = 3;
        int total = a+b+c;
        System.out.println("sum: " +total );

        //3)..String greeting enter name and greet
        String name = "Krish";
        System.out.println("Hello "+name+" ,have a good day");

        //4)..Convert Kilometer to Miles
        int km = 32;
        double miles = (0.62*km);
        System.out.println(miles);


    }
}
    
