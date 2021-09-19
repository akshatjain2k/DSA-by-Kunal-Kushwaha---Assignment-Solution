//2. Area Of Triangle
package Area;

import java.util.Scanner;
public class triangle_area {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float h,b;
        double area;
        System.out.print("Height of Triangle: ");
        h = in.nextFloat();
        System.out.print("Breadth of Triangle: ");
        b = in.nextFloat();
        
        area = h*b/2;
        System.out.println("Area of Triangle: "+area);
    }
}
