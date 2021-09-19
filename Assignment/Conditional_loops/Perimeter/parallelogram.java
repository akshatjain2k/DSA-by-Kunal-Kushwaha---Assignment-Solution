//10. Perimeter Of Parallelogram

package Perimeter;

import java.util.Scanner;

public class parallelogram {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float b,s;
        double p;

        System.out.print("Base of Parallelogram: ");
        b = in.nextFloat();
        System.out.print("Side of Parallelogram: ");
        s = in.nextFloat();

        p= 2*(b+s);
        System.out.print("Perimeter Of Parallelogram: "+p);

    }
}
