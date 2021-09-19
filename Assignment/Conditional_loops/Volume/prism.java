//15. Volume Of Prism

package Volume;

import java.util.Scanner;

public class prism {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float h,b;
        double v;
        System.out.print("Height of Prism: ");
        h = in.nextFloat();
        System.out.print("Base of Prism: ");
        b = in.nextFloat();

        v = b*h;  // Formula 
        System.out.print("Volume of Prism: "+v);


    }
}
