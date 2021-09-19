// 6. Input currency in rupee and output in dollar.

import java.util.Scanner;

public class currency {
    
    public static void main(String[] args) {
        
        double d;
        Scanner in = new Scanner(System.in);

        System.out.print("Amount in Rupee: ");
        double a = in.nextInt();

        d = (double)a/70;
        System.out.print("Amount in dollar: $"+d);
    }

}
