package accessModifiers;
class setCylinder{
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
}
public class cylinder {
    public static void main(String[] args) {
        setCylinder cy = new setCylinder();
        cy.setRadius(12);
        cy.setHeight(22);
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
    }
}
