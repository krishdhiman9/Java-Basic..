package javaPracQuestion;
class product{
    String productName = "raajmah";
    double price= 30.0;
    int quantity= 3;
void getdetails(){
    System.out.println(productName);
    System.out.println(price);
    System.out.println(quantity);
}
void calculate(){
    System.out.println(price * quantity);
}


}
public class details {
    public static void main(String [] args) {
        product pp = new product();
        pp.getdetails();
        pp.calculate();
    }
    }


