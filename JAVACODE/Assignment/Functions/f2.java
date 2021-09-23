//2. [Define a program to find out whether a given number is even or odd.]

import java.util.Scanner;

public class f2 {
    public static void main(String[] args) {
      findEvenOdd();  
    }

    static void findEvenOdd(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Any Number: ");
        int n = in.nextInt();

        if(n % 2 == 0){
            System.out.print(n+ " is an Even Number");
        }
        else{
            System.out.print(n+ " is an Odd Number");

        }
    }

}
