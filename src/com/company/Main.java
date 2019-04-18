package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean done=false;
        String again;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber = 1 + rand.nextInt(10);
        System.out.println("i am thinking a number between 1 to 10. can you guss it?");
        while(done!=true){
            int guss = scan.nextInt();
            scan.nextLine();
            int num1 = secretNumber-2;
            int num2 = secretNumber+2;
            System.out.println("hint: " +num1 +"  between " +num2 );
            if(guss<secretNumber)
                System.out.println("your number too low ");
            else if (guss>secretNumber)
                System.out.println("your number too high");
            else
                System.out.println("YOUR Correct");
            System.out.println("do you want guss again? (y/n)");
            again = scan.nextLine();
            if(again.equalsIgnoreCase("y"))
                done = false;
            else
                done = true;
        }

	// write your code here
    }
}
