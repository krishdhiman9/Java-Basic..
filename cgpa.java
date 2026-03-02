public class cgpa {
    public static void main(String[] args) {
        
        int n1 = 90;
        int n2 = 91;
        int n3 = 92;

        float totalmarks= n1 + n2 + n3 ;
        
        float percentage = (totalmarks / 300.0f) *100;
        
        float cgpa = percentage / 9.5f;
        System.out.println("percentage" + percentage);
        System.out.println("cgpa" + cgpa);
    }
    
}
