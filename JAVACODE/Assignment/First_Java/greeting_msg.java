// 2. Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class greeting_msg {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("What Is Your Name: ");
        String name = in.nextLine();

        System.out.print("Good Morning, "+ name);
    }
}
