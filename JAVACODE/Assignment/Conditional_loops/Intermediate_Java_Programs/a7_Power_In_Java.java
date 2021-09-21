// 7. Power In Java

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a7_Power_In_Java {
    public static void main(String[] args) {
        int b,e; //BAse, exponent
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Base Number: ");
        b = in.nextInt();
        System.out.print("Enter Exponent of Base: ");
        e = in.nextInt();

        long result = 1;

        while(e != 0){
            result *= b;
            --e;
        }

        System.out.print("Final Answer: "+result);


    }
}
