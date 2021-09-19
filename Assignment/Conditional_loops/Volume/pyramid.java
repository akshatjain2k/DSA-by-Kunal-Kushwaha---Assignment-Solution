//18. Volume Of Pyramid

package Volume;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float l,w,h;
        double v;
        System.out.print("Length of Pyramid: ");
        l = in.nextFloat();
        System.out.print("Width of Pyramid: ");
        w = in.nextFloat();
        System.out.print("Height of Pyramid: ");
        h = in.nextFloat();

        v = (l*w*h)/3;  // Formula 
        System.out.print("Volume of Pyramid: "+v);


    }
}
