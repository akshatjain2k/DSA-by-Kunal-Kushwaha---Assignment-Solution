//25. Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class question_25_Take_integer_inputs_till_the_user_enters_0_and_print_the_largest_number_from_all {

    public static void main(String[] args) {
        
        int max=0,sum=0;
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter Any Number: ");
        // n = in.nextInt();

        while(true){
            System.out.print("Enter Any Number: ");
            int n=in.nextInt();

            if(n>0)
                sum = sum + n;
                if (n>max) {
                    max=n;
                }
            else
                break;
     }
     System.out.println("Sum of All the element: "+sum);
     System.out.println("Largest Number: "+max);

 }
}


        
