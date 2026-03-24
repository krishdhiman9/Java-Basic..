package javaPracQuestion;

public class leftHalfPyramid {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            //print space
            for(int j = 1; j<=5-i; j++){
                System.out.print("");
            }
            //print stars
                for(int k=1; k<=i; k++){
                    System.out.print("* ");
                    
                }
            
            System.out.println();
        }
    }
}


    
//     public static void main(String[] args) {
//         //int n = 5; // number of rows

//         for (int i = 1; i <= 5; i++) {

//             // print spaces
//             for (int j = 1; j <= 5 - i; j++) {
//                 System.out.print("  ");
//             }

//             // print stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println(); // next line
//         }
//     }
// }


