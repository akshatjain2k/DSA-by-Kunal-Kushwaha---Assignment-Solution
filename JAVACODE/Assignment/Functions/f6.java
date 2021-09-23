//6. [Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.](https://beginnersbook.com/2014/01/java-program-to-calculate-area-and-circumference-of-circle/)

import java.util.Scanner;
public class f6 {
    public static void main(String[] args) {
        areaofcircle();
        circumferenceofcircle();
    }
    static void areaofcircle(){
         
        Scanner in = new Scanner(System.in);

        int r;
        double pi=3.14, area;
        System.out.print("Radius of Circle: ");
        r = in.nextInt();
        
        area = pi *r*r;
        System.out.println("Area of Circle: "+area);
    }
    static void circumferenceofcircle(){

        Scanner in = new Scanner(System.in);

        int r;
        double pi=3.14, p;
        System.out.print("Radius of Circle: ");
        r = in.nextInt();
        
        p = 2*pi*r;
        System.out.println("Perimeter of Circle: "+p);
    }
    }

