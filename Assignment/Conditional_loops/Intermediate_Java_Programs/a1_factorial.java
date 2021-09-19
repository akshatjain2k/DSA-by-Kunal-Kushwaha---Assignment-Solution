//1. Factorial Program In Java

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a1_factorial {
    static int factorial(int n){
        if(n==1 || n==0)
            return 1;
        return n * factorial(n-1);
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = in.nextInt();
        System.out.print("Factorial of Given Number is: "+factorial(num));
        }
    }

