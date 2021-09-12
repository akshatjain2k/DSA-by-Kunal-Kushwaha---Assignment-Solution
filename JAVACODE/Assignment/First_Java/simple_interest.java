package Assignment.First_Java;

import java.util.Scanner;

public class simple_interest{

    public static void main(String[] args) {
        
        float si;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Principal: ");
        float p = in.nextFloat();
        
        System.out.print("Enter the Rate: ");
        float r = in.nextFloat();

        System.out.print("Enter the Time: ");
        float t = in.nextFloat();

        si = ((p*r*t)/100);
        System.out.println("Simple Interest: "+si);

    }

}