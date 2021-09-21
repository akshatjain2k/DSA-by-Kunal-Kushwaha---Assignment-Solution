//11_Compound_Interest_Java_Program

package Intermediate_Java_Programs;

import java.util.Scanner;
import java.math.*;

public class a11_Compound_Interest_Java_Program {
    public static void main(String[] args) {

        int p,t,n;
        double r;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Initial principal balance: ");
        p = in.nextInt();
        System.out.print("Enter interest rate: ");
        r = in.nextDouble();
        System.out.print("Enter number of times interest applied per time period: ");
        n = in.nextInt();
        System.out.print("Enter number of time periods elapsed: ");
        t = in.nextInt();

        double amount = p * Math.pow(1 + (r/n), n*t );  
        double cin = amount - p;

        System.out.println("Amount after " + t + " years: "+amount);
        System.out.println("Compound Interest after " + t + " years: "+cin);
    }
}
