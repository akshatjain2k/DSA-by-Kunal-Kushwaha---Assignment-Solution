//20. Total Surface Area Of Cube

import java.util.Scanner;

public class Surface_area_cube {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float s;
        double area;
        System.out.print("Side of Cube: ");
        s = in.nextFloat();


        area = 6*(s*s);  // Formula 
        System.out.print("Surface Area of Cube: "+area);


    }
}
