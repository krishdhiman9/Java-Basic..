package Basics;

public class StringBasic {
    public static void main(String[] args) {
        //syntax
        String name = "krish";

        //method
        int number = name.length();

        System.out.println(number);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("kr","ss"));
        System.out.println(name.startsWith("kr"));
        System.out.println(name.endsWith("dd"));
        
        System.out.println(name.indexOf("s"));
        System.out.println("\n hello here we go");
        System.out.println("\tThor is god");
        System.out.println("\"hello\"");
        
    }
    
}

