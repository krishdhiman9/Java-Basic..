package dsaQ;
//largest number 

class maximum{
    int max(int a, int b){
        if(a>b){
            return a;

        }
        else {
            return b;
        }
    }
}

public class largestNum {
    public static void main(String[] args) {
        maximum m = new maximum();
        System.out.println(m.max(4,5));
        
    }
    
}
