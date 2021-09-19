// 7. Area Of Equilateral Triangle
/* Image result for 7. Area Of Equilateral Triangle
In an equilateral triangle, median, angle bisector and altitude for all sides are all the same and are the lines of symmetry of the equilateral triangle.
 */ 
package Area;

 
import java.util.Scanner;

public class equilateral_triangle_area {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float s;
        double area;
        System.out.print("Side of Equilateral Triangle: ");
        s = in.nextFloat();

        area = 1.732*s*s/4;  // Fomula is √3*a*a/4, so value of √3 = 1.732
        System.out.println("Area of Equilateral Triangle: "+area);
 }
}
