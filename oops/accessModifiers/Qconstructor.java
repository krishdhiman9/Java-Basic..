package accessModifiers;
class setCylinder{

    private int radius ;
    private int height;

    public setCylinder(){
        radius=12;
        height =13;
}
    public setCylinder(int Radius,int Height){
        Radius = radius;
        Height = height;
    }
    //methods.
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
}

public class Qconstructor {
    public static void main(String[] args) {
        setCylinder Cy = new setCylinder();

        Cy.setRadius(12);
        Cy.setHeight(13);

        System.out.println(Cy.getRadius());
        System.out.println(Cy.getHeight());



    }
    
}
