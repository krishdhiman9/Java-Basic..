package oops;
class rectangle{
    //area and perimeter of rectangle.
    int l;
    int b;
    
    public void area(){
        System.out.println("area of rectangle: " + l*b);
    }

    public void perimeter(){
        System.out.println("perimeter of rectangle: " + 2*(l+b) );
    }
}
public class QcreateRectangle {
    public static void main(String[] args) {
        rectangle Rectangle = new rectangle();


        Rectangle.l=2;
        Rectangle.b=5;
        
        Rectangle.area();
        Rectangle.perimeter();
    }
    
}
