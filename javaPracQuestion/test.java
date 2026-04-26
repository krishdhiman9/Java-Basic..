package javaPracQuestion;

public class test {
    public static void main() {
        for (int i=1; i<=4; i++){
            for(int j=3; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }System.out.println();

        }

    }
}

