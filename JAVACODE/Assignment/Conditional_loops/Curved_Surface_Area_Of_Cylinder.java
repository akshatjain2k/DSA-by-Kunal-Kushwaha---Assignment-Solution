// 19. Curved Surface  Area Of Cylinder
import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float h,r;
        double area;
        System.out.print("Height of Curved Surface Cylinder: ");
        h = in.nextFloat();
        System.out.print("Radius of Curved Surface Cylinder: ");
        r = in.nextFloat();

        area = 2*(3.14*r*h);  // Formula 
        System.out.print("Area of Curved Surface Cylinder: "+area);
    }
}
