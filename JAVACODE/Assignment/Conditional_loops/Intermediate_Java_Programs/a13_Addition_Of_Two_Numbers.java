//13. Addition Of Two Numbers

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a13_Addition_Of_Two_Numbers{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int n1,n2,n;
        System.out.print("Enter First Number: ");
        n1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        n2 = in.nextInt();
        
        n = n1 + n2;
        System.out.println("Addtion Of Given Numbers: "+n);
    }
}