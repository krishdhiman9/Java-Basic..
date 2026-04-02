package dsaQ;
import java .util.Scanner;
class result{
    int marks;
    String calgrade(){
        if(marks>=90){
            return "A";
        }
        else if (marks>=75){
            return "B";
        }
        else if(marks>=50){
            return "C";
        }
        else {
            return "fail";

        }
    }
}

public class studentResult {
    public static void main(String[] args) {
        Scanner sc new Scanner(System.in);
        result r = new result();
        r.marks=sc.nextInt();
        String grade = r.calgrade();
        System.out.println("Grade = "+ grade);
    }
    
}
