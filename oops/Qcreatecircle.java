//package oops;
class Qcircle {
    int r = 3;
    public void area(){
        System.out.println("area of circle" + (3.14*r*r));
    }
    public void perimeter(){
        System.out.println("perimetr of cicle" + (2*3.14*r));

    }


}



public class Qcreatecircle{

    public static void main(String[] args) {
        Qcircle Circle = new Qcircle();

        Circle.area();
        Circle.perimeter();
        
    }
}

