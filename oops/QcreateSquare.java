package oops;
class Square{
    int side;
    //question is create a class square with a method to initize its side, calculate area ,perimeter.
    public void area(){
        System.out.println("area of sqaure: " + (side*side));
    }

    public void perimeter(){
        System.out.println("perimeter of sqaure: " + (4*side));
    }

}
public class QcreateSquare {
    
    public static void main(String[] args) {
        Square box = new Square();
        box.side=2;
        box.area();
        box.perimeter();
    }
}
