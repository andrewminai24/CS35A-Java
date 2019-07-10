/*
Andrew Minai
Description: Calculates the employees rate if they exceeed 40 hours.
Lets the user input the amount of hours and and their rate
and shows their pay

 */


import java.util.Scanner;


public class Input{
    public static void main(String[] args){
        final int LIMIT = 40;
        final double RATE_OVERTIME = 1.5;

        Scanner input = new Scanner(System.in); // Creates a scanner



        System.out.println("Enter the hours");
        double hours = input.nextDouble();
        System.out.println("Enter the rate");
        double rate = input.nextDouble();

        if(hours <= LIMIT ){
            double pay = hours * RATE_OVERTIME;
            System.out.println("Pay" + pay);
        }else{
            double regular = LIMIT * rate;
            double EndResult = (hours - LIMIT) * RATE_OVERTIME * rate;
            double pay = regular + EndResult;
            System.out.println(" Pay " + pay);
        }

    }
}