import java.util.Scanner;

    class Increment{
        public static void main(String args[]){
            Scanner andrew = new Scanner (System.in);

            int tuna = 5;
            int bass = 18;
            System.out.println(tuna++);
            //This tuna++ is going to keep the value as 5
            //And output 6 on the nextline.
            System.out.println(tuna);
        }
    }