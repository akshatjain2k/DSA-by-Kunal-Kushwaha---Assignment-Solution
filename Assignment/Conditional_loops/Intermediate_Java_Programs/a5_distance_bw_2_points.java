//5. Calculate Distance Between Two Points 

package Intermediate_Java_Programs;

import java.util.Scanner;
import java.lang.Math;

public class a5_distance_bw_2_points {
    public static void main(String[] args) {

        int a,b,d;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Point A: ");
        a = in.nextInt();
        System.out.print("Enter Point B: ");
        b = in.nextInt();
    
        d = Math.abs(b-a);
        System.out.print("Distance Between Point A to B is: "+d);

    }
}
