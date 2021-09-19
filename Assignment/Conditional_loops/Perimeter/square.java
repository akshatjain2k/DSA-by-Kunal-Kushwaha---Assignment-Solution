//12. Perimeter Of Square

package Perimeter;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float s;
        double p;
        System.out.print("Side of Square: ");
        s = in.nextFloat();

        p = 4*s;  // Fomula is 3s
        System.out.println("Perimeter of Square: "+p);
    }
}
