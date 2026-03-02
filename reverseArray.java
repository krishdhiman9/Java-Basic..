public class reverseArray {
    public static void main(String[] args) {
        int[] n={22, 33, 44, 55, 66};
        
        for(int i=n.length-1; i>=0; i--){
            System.out.print(n[i] + ",");
        }
    }

}
