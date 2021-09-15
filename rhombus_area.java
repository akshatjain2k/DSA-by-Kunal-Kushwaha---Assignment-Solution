// 6. Area Of Rhombus

import java.util.Scanner;

public class rhombus_area {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        float d1,d2;
        double area;
        System.out.print("Length of First diagonal of the Rhombus : ");
        d1 = in.nextFloat();
        System.out.print("Length of Second diagonal of the Rhombus : ");
        d2 = in.nextFloat();
        
        area = d1*d2/2; // Formula
        System.out.println("Area of Rhombus: "+area);
    }
}
