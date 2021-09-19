//16. Volume Of Cylinder

package Volume;

import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float h,r;
        double v;
        System.out.print("Height of Cylinder: ");
        h = in.nextFloat();
        System.out.print("Radius of Cylinder: ");
        r = in.nextFloat();

        v = (3.14*r*r*h);  // Formula 
        System.out.print("Volume of Cylinder: "+v);


    }
}
