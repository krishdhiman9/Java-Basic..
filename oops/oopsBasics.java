package oops;
// a class (only one class create in program)
class employee{
    int id;
    String name;
    int age;
    int salary;

    //creating a function
    public void getDetails(){
        System.out.println("my id is " + id);
        System.out.println("my name is.. " + name);
        System.out.println("age is.. "+ age);
        System.out.println("salary is " + salary);
    }
}
public class oopsBasics {
    public static void main(String[] args) {
        System.out.println("Hello");

        //creating class and object
        employee Rahul = new employee();
        employee Harry = new employee();

        //assigning values to object
        Rahul.name = "Rahul Sronia";
        Rahul.id = 11;
        Rahul.age = 17;
        Rahul.salary=20000;


        Harry.name = "Harry Sandhu";
        Harry.id = 12;
        Harry.age = 18;
        Harry.salary = 21000;


        //System.out.println(Rahul.id);
        //System.out.println(Harry.id);
        //System.out.println(Rahul.name);
        //System.out.println(Harry.name);

        //using function to print the values.
        Rahul.getDetails();
        Harry.getDetails();    
    }
    
}
