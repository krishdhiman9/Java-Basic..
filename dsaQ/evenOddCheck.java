package dsaQ;
//even or odd checker using function.
class evenodd{
    boolean num(int a){
        if (a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}

public class evenOddCheck {
    public static void main(String[] args) {
        evenodd eo = new evenodd();
        System.out.println(eo.num(4));
    }
    
}
