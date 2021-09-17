import java.util.Scanner;

//22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
public class question_22 {
    public static void main(String[] args) {
        int num,digit,prod=1,sum=0,result=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        num = in.nextInt();

        while(num>0){
            digit = num % 10;
            sum = sum + digit;
            prod = prod*digit;
            result = prod - sum;
            num = num/10;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+prod);
        System.out.println("Product - Sum: "+result);
    }
    
}
