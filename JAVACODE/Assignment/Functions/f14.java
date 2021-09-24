//14. [Write a function that returns the sum of first n natural numbers.]

import java.util.Scanner;

public class f14 {
    public static void main(String[] args) {
        sumofN();
    }    
    static void sumofN(){
        Scanner in =new Scanner(System.in);
        
        int sum =0;
        System.out.print("Enter Any Number: ");
        int n = in.nextInt();

        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of NAtural Numbers: "+sum);
    }
}
