// 3. Area Of Rectangle Program 
package Area;

import java.util.Scanner;

public class rectangle_area {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float w,l;
        double area;
        System.out.print("Length of Rectangle: ");
        l = in.nextFloat();
        System.out.print("Width of Rectangle: ");
        w = in.nextFloat();
        
        area = l*w;
        System.out.println("Area of Rectangle: "+area);
    }
}
