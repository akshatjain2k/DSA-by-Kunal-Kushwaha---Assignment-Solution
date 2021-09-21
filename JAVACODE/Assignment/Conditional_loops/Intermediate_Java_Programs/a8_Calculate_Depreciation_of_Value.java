//8 Calculate Depreciation of Value

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a8_Calculate_Depreciation_of_Value {
    public static void main(String[] args) {
        int cost,salvage_value,lifespan;
        float depreciation;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Cost: ");
        cost = in.nextInt();
        System.out.print("Enter Salvage Value: ");
        salvage_value = in.nextInt();
        System.out.print("Enter Lifespan: ");
        lifespan = in.nextInt();

        depreciation = (cost-salvage_value)/lifespan;
        System.out.print("Total Depreciation is: "+depreciation);
    }
}
