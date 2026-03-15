package accessModifiers;
class MymainEmployee{
    private int id;
    private String name;

    //method overloading
    public MymainEmployee(){
        id = 12;
        name = "krish dhiman ";
    }
    //constructor 
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
        //below line is use with constructor. 
        //MymainEmployee em = new MymainEmployee( "krish dhiman", 3344 );
        
        //this line for method overloading.
        MymainEmployee em = new MymainEmployee();
        System.out.println(em.getId());
        System.out.println(em.getName());
    }
}