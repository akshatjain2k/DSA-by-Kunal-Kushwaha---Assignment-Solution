package Assignment.First_Java;

import java.util.Scanner;

public class greeting_msg {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("What Is Your Name: ");
        String name = in.nextLine();

        System.out.print("Nice To Meet You, "+name);
    }
}
