//3. Calculate Average Of N Numbers

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a3_Average_of_N_numbers {
    public static void main(String[] args) {
        
        int sum=0,div=0;
        double avg=0;
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter Any Number: ");
        // n = in.nextInt();

        while(true){
            System.out.print("Enter Any Number: ");
            int n=in.nextInt();
            div = div +1;
            
            if(n>0)
                
                sum = sum + n;
            
            else
                break;
      
            avg = sum/div;
     }
     System.out.println(div);
     System.out.print("Average of All the element: "+avg);
    }
}
