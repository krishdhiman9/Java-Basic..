package oops;
class CellPhone{
    //problem is => create a class cellphone with mwthods to print "ringing",,"vibrating"...
    
    
    public void ringing(){
        System.out.println("your phone is ringing");
    }
    public void vibrating(){
        System.out.println("your phone is vibrating");
    }
    
}

public class QCellphn{
    public static void main(String[] args) {
    
        CellPhone hello = new CellPhone();
        hello.ringing();
        hello.vibrating();
    }
}
