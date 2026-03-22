package accessModifiers;
class Rectangle {
    private int length;
    private int breadth;
    
    public Rectangle(){
        length = 22;
        breadth = 3;
    }
    public Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    
    public int getLength(){
        return length;
    }
    public void setLenght(int l){
        length = l;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public int getParameter(){
        return 2*(length + breadth);
    }
    

}
public class Qoverloading{
    public static void main(String[] args) {
        //Rectangle r = new Rectangle(4,5);
        Rectangle r = new Rectangle();
        //System.out.println(r.getParameter());

        r.setLenght(23);
        r.setBreadth(23);
        System.out.println(r.getParameter());
 }
}
