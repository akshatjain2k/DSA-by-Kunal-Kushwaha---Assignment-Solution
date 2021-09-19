import java.util.Scanner;

public class Fibonacci_Series {
    
    static int fib(int n){
        if(n <= 1){ 
            return n;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int n = in.nextInt();
        System.out.print("Fibonacci Number: "+fib(n));
        
        
    }
}
