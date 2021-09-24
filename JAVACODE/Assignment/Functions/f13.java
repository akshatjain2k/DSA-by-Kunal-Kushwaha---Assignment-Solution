//13. [Write a function that returns all prime numbers between two given numbers.]

import java.util.Scanner;

public class f13 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int n1,n2,flag;
         System.out.print("Enter Number 1: ");
         n1 = in.nextInt();
         System.out.print("Enter Number 2: ");
         n2 = in.nextInt();
         
         System.out.print("\nPrime numbers are: ");

         for(int i=n1; i<=n2; i++){
            if (i == 1 || i == 0)
                continue;
            flag=1;

            for( int j=2; j<i/2; ++j){
                if(i % j == 0){
                    flag = 0;
                    break;
                }
            } 
            if(flag==1){
                System.out.print(i+", "); 
        }
     }
}}
