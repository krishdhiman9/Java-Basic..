package loopingQ.whileloop;

public class sumFirstTen {
    public static void main(String[] args) {
        
        int i=0;
        int sum = 0;
        
        while (i<=12) {
            sum = sum +i;
            i++;
        }
        
        System.out.println("sum is first 10 natural number is : " + sum);
    }
    
}
