//7. [Define a method to find out if a number is prime or not.

import java.util.Scanner;

public class f7 {
    public static void main(String[] args) {
        checknum();
    }   
    
    static void checknum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = in.nextInt();

        for( int i=2; i<num; i++){
            if(num % i == 0){
                System.out.print(num+" Is Not A Prime Number");
                break;
            }
            else{
                System.out.print(num+" Is A Prime Number");
                break;

            }
        }
    }
}
