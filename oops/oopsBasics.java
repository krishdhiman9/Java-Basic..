package oops;
// a class (only one class create in program)
class employee{
    int id;
    String name;
    int age;
    int salary;

    //creating a function
    public void show(){
        System.out.println("ID is " + id);
        System.out.println("name is.. " + name);
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
        Rahul.id = 11;
        Rahul.age = 17;

        Harry.id = 12;

        System.out.println(Rahul.id);
        System.out.println(Harry.id);








    }
    
}
