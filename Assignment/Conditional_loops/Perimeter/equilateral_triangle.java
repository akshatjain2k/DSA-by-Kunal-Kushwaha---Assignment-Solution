// 9. Perimeter Of Equilateral Triangle

package Perimeter;

import java.util.Scanner;

public class equilateral_triangle {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float s;
        double area;
        System.out.print("Side of Equilateral Triangle: ");
        s = in.nextFloat();

        area = 3*s;  // Fomula is 3s
        System.out.println("Perimeter of Equilateral Triangle: "+area);
    }
}
