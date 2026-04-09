package javaPracQuestion;


public class sumArray {public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);
    int [][] arr = {{1,2,3},{4,0,6},{7,8,9}};
    int sum = 0;
    for(int i = 0; i<arr.length;i++){
        for( int j=0;j<arr.length;j++){
            //arr [i][j]= sc.nextInt();
            sum += arr[i][j];
        }
    }System.out.println(sum);
}
}
