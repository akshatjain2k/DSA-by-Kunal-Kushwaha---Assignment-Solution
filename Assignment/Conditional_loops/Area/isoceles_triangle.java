// 4. Area Of Isosceles Triangle :- 
// Isosceles Triangle- A triangle with any two sides/angles equal. 
package Area;

import java.util.Scanner;

public class isoceles_triangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float h,b;
        double area;
        System.out.print("Height of Isoceles Triangle: ");
        h = in.nextFloat();
        System.out.print("Breadth of Isoceles Triangle: ");
        b = in.nextFloat();
        
        area = h*b/2;
        System.out.println("Area of Isoceles Triangle: "+area);
    }
}
