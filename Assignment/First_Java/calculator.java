// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class calculator{

    public static void main(String[] args) {
        
        int n;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Value Number 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter Value Number 2: ");
        int n2 = in.nextInt();
        System.out.println("Choose What do you want to do: ");
        System.out.println("Type 1 for Addition");
        System.out.println("Type 2 for Substraction");
        System.out.println("Type 3 for Multiplication");
        System.out.println("Type 4 for Division");

        int x = in.nextInt();

        if(x==1){
            n = (n1 + n2);
            System.out.println("Addition of Given Number is: "+n);
        }
        else if(x==2){
            n = (n1 - n2);
            System.out.println("Substraction of Given Number is: "+n);
        }
        else if(x==3){
            n = (n1 * n2);
            System.out.println("Multiplication of Given Number is: "+n);
        }
        else if(x==4){
            n = (n1 / n2);
            System.out.println("Division of Given Number is: "+n);
        }
        else{
            System.out.println("INVALID INPUT");
        }

    }

}