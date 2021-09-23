//3. [A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.]
import java.util.Scanner;
public class f3 {
    public static void main(String[] args) {
    voteage();
}    
    static void voteage(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = in.nextInt();

        if (age > 18) {
            System.out.print("You Are Eligible For Votting");
        }
        else{
            System.out.print("You Are Not Eligible For Votting");
        }
    }
}
