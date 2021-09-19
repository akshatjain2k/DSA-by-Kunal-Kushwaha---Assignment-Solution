//14. Volume Of Cone Java Program
package Volume;

import java.util.Scanner;

public class cone {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float h,r;
        double v;
        System.out.print("Height of Cone: ");
        h = in.nextFloat();
        System.out.print("Radius of Cone: ");
        r = in.nextFloat();

        v = (3.14*r*r*h)/3;  // Formula 
        System.out.print("Volume of Cone: "+v);


    }
}
