package accessModifiers;
    class Cylinder{
    private int radius;
    private int height;

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

    public void surface(){
        System.out.println(2*3.14*radius*height);
    }
    public void volume(){
        System.out.println( 3.14*radius*radius*height);
    }
}
public class surface_volume_cy {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setRadius(12);
        cy.setHeight(22);       
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        cy.surface();
        cy.volume();
       
    }
}
