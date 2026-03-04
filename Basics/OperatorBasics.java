package Basics;

public class OperatorBasics {
    public static void main(String[] args) {
         int a = 10, b = 3;
        //Arithmetic Operators
        System.out.println(a + b);  // 13
        System.out.println(a - b);  // 7
        System.out.println(a * b);  // 30
        System.out.println(a / b);  // 3
        System.out.println(a % b);  // 1

        //Relational (Comparison) Operators
        int x = 5, y = 10;
        System.out.println(x < y);  // true
        System.out.println(x == y); // false

        //Logical Operators
        boolean aa = true;
        boolean bb = false;

        System.out.println(aa && bb);  // false
        System.out.println(aa || bb);  // true
        System.out.println(!aa);      // false
    }
    
}
