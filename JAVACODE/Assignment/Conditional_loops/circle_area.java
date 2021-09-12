import java.util.Scanner;

public class circle_area{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int r;
        double pi=3.14, area;
        System.out.print("Radius of Circle: ");
        r = in.nextInt();
        
        area = pi *r*r;
        System.out.println("Area of Circle: "+area);
    }

}