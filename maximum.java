public class maximum {
    public static void main(String[] args) {
        int[] n={88,4,699,99,8};
        int max=n[0];

        for(int i=0; i<n.length; i++){
            if (n[i]<max) {
                max=n[i];
            }
        }
            System.out.println(max);
        
    }
}
