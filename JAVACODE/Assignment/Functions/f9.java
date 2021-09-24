//9. [Write a program to print the factorial of a number by defining a method named 'Factorial'.]

import java.util.Scanner;

public class f9 {
   public static void main(String[] args) {
       factorial();
   }
   static void factorial(){
       int n,num=1;
       Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        n = in.nextInt();

        for(int i=1; i<=n; i++){
            num = num*i;
        }
        System.out.print("Factorial of "+n+" is: "+num);

   }
}

