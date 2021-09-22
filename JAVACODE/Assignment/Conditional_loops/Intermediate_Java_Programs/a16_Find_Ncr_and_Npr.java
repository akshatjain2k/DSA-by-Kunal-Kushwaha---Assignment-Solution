//16. Find Ncr & Npr

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a16_Find_Ncr_and_Npr {
        static int nCr(int n, int r){
            return factorial(n) / (factorial(r) * factorial(n-r));
        }
        static int factorial(int n){
            if(n==1 || n==0)
                return 1;
            return n * factorial(n-1);
            
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            System.out.print("Enter N: ");
            int n = in.nextInt();
            System.out.print("Enter r: ");
            int r = in.nextInt();

            System.out.print(nCr(n, r));
            
    }    
}
