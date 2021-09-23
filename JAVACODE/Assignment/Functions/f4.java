//4. [Write a program to print the sum of two numbers entered by user by defining your own method.]

import java.util.Scanner;

public class f4 {
    public static void main(String[] args) {
    sum();
}    
    static void sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int a = in.nextInt();
        System.out.print("Enter Number 2: ");
        int b = in.nextInt();


        int c = a + b;
        System.out.print("Sum Of Two Given Number Is: "+c);

    }
}
