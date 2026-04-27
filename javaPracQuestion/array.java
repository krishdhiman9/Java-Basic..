package javaPracQuestion;

public class array {
   public static void main(String[] args) {
        int [] arr = {1,2,55,3};
        int target =55;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Found: "+arr[i]);
            }
        }
    }
}
