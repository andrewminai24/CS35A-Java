/*Author:Andrew Minai
Description: This program is giving input to the user asking
what message they would like to write and how many times their message
would like to run.Prompting the user for which loop they would
like to incorporate.Lastly it displays a random number in the end of the program.
*/

import java.util.Random;
import java.util.Scanner;

class Exercise7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = s.nextLine();
        System.out.print("How many times do you want your message to run:");
        int HowMany = s.nextInt();
        int i = 0;

        System.out.println("Enter a message: ");
        System.out.println("There are three different type of loops:\n");
        System.out.println("1: Whileloop");
        System.out.println("2: DoWhileloop");
        System.out.println("3: Forloop");
        int which = s.nextInt();

        String loop;
        switch(which){
            case 1:
            loop = "whileloop";
            System.out.println("Using 'while' loop");
            while (i < HowMany) {
                System.out.println(i+1 + " : " +message);
                i++;
            }
            break;
            case 2:
            loop = "dowhile";
            System.out.println("Using 'dowhile' loop");
            do {
                System.out.println(i+1 + " : " +message );
                i++;
            } while (i < HowMany);
            break;
            case 3:
            loop =  "forloop";
            System.out.println("Using 'for' loop:");
            for (int count = 0; i < HowMany; i++) {
                System.out.println(i+1 + " : " +message);
            }
            break;

        }

        int RandomNumber = 1000 + (int) (Math.random() * 500);
        System.out.println("Your document number is: " + RandomNumber);

    }


}
