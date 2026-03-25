package accessModifiers;

class students{
    private String name;
    private int calss;
    private int age ;
 
    public students(){
        name = null;
        calss = 0;
        age = 0;
    }

    public void setValues(String s,int c, int a){
        name = s;
        calss = c;
        age = a;
        if(age<18){
            
        }
    }

     public String getName(){
        return name;
    }
     public int getCalss(){
        return calss;
     }

     public int getAge(){
        return age;
    }
    
}


public class main {
    public static void main(String[] args) {
        students s = new students();
        s.setValues(null, 12, 13);
        
        System.out.println(s.getCalss());
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
    
}
