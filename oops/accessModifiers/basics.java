package accessModifiers;
class Myemployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class basics {
    public static void main(String[] args) {
        Myemployee krish = new Myemployee();
        //krish.id=34;
        //krish.name=("krish dhiman ");
        krish.setName("Krish Dhiman");
        System.out.println("name " + krish.getName());

        krish.setId(132);
        System.out.println("id " + krish.getId());


    }
    
}
