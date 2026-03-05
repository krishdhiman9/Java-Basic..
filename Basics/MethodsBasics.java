package Basics;

public class MethodsBasics {
    public static void greet() {
        System.out.println("Hello!");
    }
    public static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {

        greet();

        int result = square(5);
        System.out.println(result);
    }
}

    

