package oops;
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

public class createEmp {
    public static void main(String[] args) {
        Employee krish = new Employee();
        krish.salary = 233;
        //krish.name = "Krish dhiman";
        //System.out.println(krish.name); 
        krish.setName("krish dhiman");
        System.out.println(krish.getName());
        System.out.println(krish.getSalary());
    }
    
}
