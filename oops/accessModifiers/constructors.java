package accessModifiers;
class MymainEmployee{
    private int id;
    private String name;

    //public MymainEmployee(){
    //    id = 12;
      //  name = "krish dhiman ";
    //}

    public MymainEmployee(String myName , int Id){
        id = Id;
        name = myName;
    }

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

public class constructors {
    public static void main(String[] args) {
        MymainEmployee em = new MymainEmployee( "krish dhiman", 3344 );

        System.out.println(em.getId());
        System.out.println(em.getName());
    }
}