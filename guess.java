import java.util.Scanner;
class gues{
    private int number;

    gues(int n){
        number = n;
    }

    public void setInput(){
        Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            check(guess);
    }

    public void check(int guess ){
        if(guess == number){
            System.out.println("Correct Guess");

        }else{
            System.out.println("Incorrect");
        }}
    
}

public class guess {
    public static void main(String[] args) {
        gues g = new gues(5);
        System.out.println("Enter number: ");
        g.setInput();
        

        
    }
    
}
