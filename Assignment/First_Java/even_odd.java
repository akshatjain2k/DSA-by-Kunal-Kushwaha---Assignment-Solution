// 1. Write a program to print whether a number is even or odd, also take input.


import java.util.Scanner;

public class even_odd {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println(num+ " is a Even Number");
        }
        else{
            System.out.println(num+ " is a Odd Number");

        }
    }

}
