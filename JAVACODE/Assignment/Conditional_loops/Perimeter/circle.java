// 8. Perimeter Of Circle

package Perimeter;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int r;
        double pi=3.14, p;
        System.out.print("Radius of Circle: ");
        r = in.nextInt();
        
        p = 2*pi*r;
        System.out.println("Perimeter of Circle: "+p);
    }
}
