package dsaQ;
//area and circumfernce of circle. 
class circleinput{
int radius= 7;
double Area(){
    return 3.14*radius*radius;
}
double Circumference(){
    return 2*3.14*radius;
}
}

public class circle {
    public static void main(String[] args) {
        circleinput c = new circleinput();
        System.out.println("area = " + c.Area());
        System.out.println("Circumfernece = " + c.Circumference());
    }
    
}
