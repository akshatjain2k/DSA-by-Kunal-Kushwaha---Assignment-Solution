//8. [Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:]

import java.util.Scanner;

public class f8 {
    public static void main(String[] args) {
        checkgrade();
    }    

    static void checkgrade(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Score Out Of 100: ");
        int s = in.nextInt();

        if(s >= 0 && s<=40){
            System.out.print("You Are Failed");
        }
        else if(s > 40 && s<=50){
            System.out.print("You Got DD grade");
        }
        
        else if(s > 50 && s<=60){
            System.out.print("You Got CD grade");
        }
        else if(s > 60 && s<=70){
            System.out.print("You Got BC grade");
        }
        else if(s > 70 && s<=80){
            System.out.print("You Got BB grade");
        }
        else if(s > 80 && s<=90){
            System.out.print("You Got AB grade");
        }
        else if(s > 90 && s<=100){
            System.out.print("You Got AA grade");
        }
        else{
            System.out.print("Type A Valid Input");
        }
    }
}

