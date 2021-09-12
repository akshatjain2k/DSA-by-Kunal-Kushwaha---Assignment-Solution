package Assignment.First_Java;

import java.util.Scanner;

public class largest_num {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Number 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = in.nextInt();

        if(n1>n2){
            System.out.println(n1+ " is Largest Number");
        }
        else if(n1==n2){
            System.out.println("Both Input Are Same");

        }
        else{
            System.out.println(n2+ " is Largest Number");

        }
    }

}
