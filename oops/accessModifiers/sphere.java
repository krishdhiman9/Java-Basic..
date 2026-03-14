package accessModifiers;
class setSphere{
    private int radius;
    
    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        radius = r;
    }
    public double surface(){
        return 4*3.14*radius*radius;
    }
}


public class sphere {
    public static void main(String[] args) {
        setSphere sph = new setSphere();
        sph.setRadius(12);
        System.out.println(sph.getRadius());
        System.out.println(sph.surface());


    }
}
