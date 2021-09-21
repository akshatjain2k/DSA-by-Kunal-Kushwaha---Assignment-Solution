//12. Calculate Average Marks

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a12_calculate_avg_marks {
    public static void main(String[] args) {
        int n,n1,n2,n3,n4,n5;
        Scanner in = new Scanner(System.in);

        System.out.print("Marks of Subject 1: ");
        n1 = in.nextInt();
        System.out.print("Marks of Subject 2: ");
        n2 = in.nextInt();
        System.out.print("Marks of Subject 3: ");
        n3 = in.nextInt();
        System.out.print("Marks of Subject 4: ");
        n4 = in.nextInt();
        System.out.print("Marks of Subject 5: ");
        n5 = in.nextInt();
        
        n = (n1+n2+n3+n4+n5)/5;
        System.out.print("Average of Total Marks: "+n);
    }  
}
