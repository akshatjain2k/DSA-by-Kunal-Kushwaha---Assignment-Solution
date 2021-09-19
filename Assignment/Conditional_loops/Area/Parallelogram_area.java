// 5. Area Of Parallelogram
package Area;

import java.util.Scanner;

public class Parallelogram_area {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float h,b;
        double area;
        System.out.print("Height of Parallelogram: ");
        h = in.nextFloat();
        System.out.print("Base of Parallelogram: ");
        b = in.nextFloat();
        
        area = h*b; // Formula
        System.out.println("Area of Parallelogram: "+area);
    }
}
