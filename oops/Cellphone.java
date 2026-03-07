package oops;
class Phone{
    //problem is => create a class cellphone with mwthods to print "ringing",,"vibrating"...
    
    
    void ringing(){
        System.out.println("your phone is ringing");
    }
    void vibrating(){
        System.out.println("your phone is vibrating");
    }
    
}

public class Cellphone{
    public static void main(String[] args) {
    
        Phone hello = new Phone();
        hello.ringing();
        hello.vibrating();
    }
}
