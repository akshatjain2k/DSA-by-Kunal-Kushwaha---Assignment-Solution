//13. Perimeter Of Rhombus

package Perimeter;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float s;
        double p;
        System.out.print("Side of Rhombus: ");
        s = in.nextFloat();

        p = 4*s;  // Fomula is 3s
        System.out.println("Perimeter of Rhombus: "+p);
    }
}

