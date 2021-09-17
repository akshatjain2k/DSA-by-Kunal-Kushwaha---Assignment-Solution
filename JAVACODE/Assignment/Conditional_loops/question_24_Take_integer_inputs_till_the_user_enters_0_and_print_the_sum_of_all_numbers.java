//24. Take_integer_inputs_till_the_user_enters_0_and_print_the_sum_of_all_numbers

import java.util.Scanner;

public class question_24_Take_integer_inputs_till_the_user_enters_0_and_print_the_sum_of_all_numbers {
    public static void main(String[] args) {
        
        int n,sum=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        n = in.nextInt();

        while(n != 0){
            if(n<0){
                System.out.println("Invalid NUmber");
            }
            else{
                sum = sum + n;

            }
        }
        sum = sum + n;
        System.out.println("Sum of All the element: "+sum);
 }
}
