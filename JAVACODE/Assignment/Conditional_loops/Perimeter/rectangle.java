// 11. Perimeter Of Rectangle

package Perimeter;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float l,w;
        double p;

        System.out.print("length of Rectangle: ");
        l = in.nextFloat();
        System.out.print("Width of Rectangle: ");
        w = in.nextFloat();

        p= 2*(l+w);
        System.out.print("Perimeter Of Rectangle: "+p);

    }
}

