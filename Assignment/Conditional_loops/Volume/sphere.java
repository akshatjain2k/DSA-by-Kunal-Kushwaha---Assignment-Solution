//17. Volume Of Sphere

package Volume;

import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float r;
        double v;

        System.out.print("Radius of Cone: ");
        r = in.nextFloat();

        v = (3.14*r*r*r)*4/3;  // Formula 
        System.out.print("Volume of Cone: "+v);


    }
}
