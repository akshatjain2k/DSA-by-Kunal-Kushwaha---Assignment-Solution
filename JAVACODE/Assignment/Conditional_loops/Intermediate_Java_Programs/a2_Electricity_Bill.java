//2. Calculate Electricity Bill

package Intermediate_Java_Programs;

import java.util.Scanner;

public class a2_Electricity_Bill {

   public static void main(String[] args) {
        int unit;
        double bill_pay=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Total Consume unit: ");
        unit = in.nextInt();
        if(unit <= 100){
            bill_pay = unit * 1.20;
        }
        else if (unit < 300){
            bill_pay = 100*1.20 + (unit - 100)*2;
        }
        else if (unit >= 300){
            bill_pay = 100*1.20+ 200*2 + (unit - 300)*2;
        }
        System.out.print("Bill To Pay: "+bill_pay);
            
   }
    
}
