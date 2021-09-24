//[Write a function to find if a number is a palindrome or not. Take number as parameter.]

import java.util.Scanner;

public class f10 {
    public static void main(String[] args) {
        checkpalindrome();
    }    
    static void checkpalindrome(){
        Scanner in = new Scanner(System.in);
        
        int n, t, reversed=0;
        System.out.print("Enter Any Number: ");
        n = in.nextInt();

        t = n;
        while( n != 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;

            n /= 10;
        }
        if(t == reversed){
            System.out.print("Number is Palindrome");
        }
        else{
            System.out.print("Number is not Palindrome");

        }
    }
}
