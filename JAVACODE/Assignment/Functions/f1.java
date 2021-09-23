//1. [Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.]

// Do minimum same as maximum...just try by yourself
import java.math.*;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class f1{
    public static void main(String[] args) {
        findmax1();
        findmax2();
    }

     static void findmax1(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = in.nextInt();
            System.out.print("Enter Number 3: ");
            int num3 = in.nextInt();

            if (num1> num2){
                if(num1>num3){
                    System.out.print(num1+" is Largest NUmber");
                }
                else{
                    System.out.print(num3+" is Largest NUmber");
                }                
            }
            else if(num2>num1){
                if(num2>num3){
                    System.out.print(num2+" is Largest NUmber");
                }
                else{
                    System.out.print(num3+" is Largest NUmber");
                }  
            }
            else{
                System.out.print("Invalid Input");
            }
        }
    
    static void findmax2(){
        Scanner in = new Scanner(System.in);
            System.out.print("Enter Number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = in.nextInt();
            System.out.print("Enter Number 3: ");
            int num3 = in.nextInt();

            double max = DoubleStream.of(num1,num2,num3).max().getAsDouble();
            System.out.println(max);
    }
}
    