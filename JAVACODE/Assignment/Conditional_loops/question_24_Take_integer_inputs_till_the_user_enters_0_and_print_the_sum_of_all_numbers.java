//24. Take_integer_inputs_till_the_user_enters_0_and_print_the_sum_of_all_numbers

import java.util.Scanner;

public class question_24_Take_integer_inputs_till_the_user_enters_0_and_print_the_sum_of_all_numbers {
    public static void main(String[] args) {
        
        int sum=0;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.print("Enter Any Number: ");
            int n=in.nextInt();

            if(n>0)
                sum = sum + n;
            
            else
                break;
            
     }
     System.out.println("Sum of All the element: "+sum);

 }}


        
