//6. Calculate Commission Percentage

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a6_Calculate_Commission_Percentage{
    public static void main(String[] args) {

        int sp; // Sale Price , Total Commision
        float tc,cp; // Commision Percentage
        Scanner in = new Scanner(System.in);

        System.out.print("Total Sale Price: ");
        sp = in.nextInt();
        System.out.print("Total Commision taken by Broker: ");
        tc = in.nextFloat();

        cp = tc*100/sp;
        System.out.print("Total Commision in Percent: "+cp+"%");

    }
}