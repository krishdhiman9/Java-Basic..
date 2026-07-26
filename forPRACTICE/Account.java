package forPRACTICE;
class account1{
    int amount(int a){
        return a;

    }
    int deposit(int b){
        return b;
    }
    int withdrawl(int c ){
        return c;
    }
    int checkb(int d){
        return d;
    }


}
public class Account {
    public static void main(String[] args) {
        account1 ac = new account1();
        System.out.println(ac.amount(900));
        System.out.println(ac.deposit(100));
        System.out.println(ac.withdrawl(200));
        System.out.println(ac.checkb(100));
        
    }
}
