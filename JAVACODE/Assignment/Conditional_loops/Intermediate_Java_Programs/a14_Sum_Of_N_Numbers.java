// 14. Sum Of N Numbers

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a14_Sum_Of_N_Numbers {
    public static void main(String[] args) {
        
        int sum=0;
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter Any Number: ");
            int n = in.nextInt();
            if (n>0){
                sum += n;
            }
            else{
                break;
            }
        }
        System.out.print("Sum of N Numbers: "+sum);
    }
}
