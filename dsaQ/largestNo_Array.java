package dsaQ;
public class largestNo_Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int largest = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (largest<arr[i]){
                largest = arr[i];

            }
            

        }
        System.out.println(largest);
        
    }
    
}
