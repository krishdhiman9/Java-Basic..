package accessModifiers;
class setCylinderr {

    private int radius ;
    private int height;

    public setCylinderr(){
        radius=12;
        height =13;
}
    public setCylinderr(int Radius, int Height){
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
        setCylinderr Cy = new setCylinderr();
        Cy.setRadius(33);
        Cy.setHeight(44);

        System.out.println(Cy.getRadius());
        System.out.println(Cy.getHeight());



    }
    
}
