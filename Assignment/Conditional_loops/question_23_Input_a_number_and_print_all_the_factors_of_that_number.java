// 23. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class question_23_Input_a_number_and_print_all_the_factors_of_that_number {
    public static void main(String[] args) {
        
        int n;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        n = in.nextInt();

        System.out.println("Factors of "+n+" are: ");
        for(int i=1;i<=n; i++){
            if(n % i == 0){
               System.out.print(i+",");
            }
        }

    }
}
