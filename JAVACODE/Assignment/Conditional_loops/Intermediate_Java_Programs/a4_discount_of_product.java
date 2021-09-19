//4. Calculate Discount Of Product

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a4_discount_of_product{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p;
        System.out.println("Choose product on which do you want to know how much discount you will get: ");
        System.out.println("Type 1 for Computer Table");
        System.out.println("Type 2 for Laptop");
        System.out.println("Type 3 for Monitor");
        System.out.println("Type 4 for Keyboard-Mouse Combo");
        System.out.println("Type 5 for Mouse Pad");
        p = in.nextInt();


        if(p == 1){
            System.out.print("20% Discount Available on Computer Tables");
        }
        else if(p == 2){
            System.out.print("5% Discount Available on Laptops");
        }
        else if(p == 3){
            System.out.print("10% Discount Available on Monitors");
        }
        else if(p == 4){
            System.out.print("35% Discount Available on Keyboard-Mouse Combo");
        }
        else if(p == 5){
            System.out.print("50% Discount Available on Mouse Pad");
        }
        else{
            System.out.print("Please choose correct option");
        }
    }
}