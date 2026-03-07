package oops;
//create class
class Employee{
    int salary;
    String name;

    //set salary.
    public int getSalary(){
        return salary;
    }
    //get name.
    public String getName(){
        return name;
    }

    //set a name.
    public void setName(String n){
        name = n;
    }
}

public class createEmp {
    public static void main(String[] args) {
        //creating object.
        Employee krish = new Employee();
        krish.salary = 233;
        //krish.name = "Krish dhiman";
        //System.out.println(krish.name); 
        krish.setName("krish dhiman");
        System.out.println(krish.getName());
        System.out.println(krish.getSalary());
    }
    
}
