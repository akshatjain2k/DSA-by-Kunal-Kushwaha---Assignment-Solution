//5. [Write a program to print the product of two numbers entered by user by defining your own method.]

import java.util.Scanner;

public class f5 {
    public static void main(String[] args) {
    product();
}    
    static void product(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int a = in.nextInt();
        System.out.print("Enter Number 2: ");
        int b = in.nextInt();


        int c = a * b;
        System.out.print("product Of Two Given Number Is: "+c);

    }
}
