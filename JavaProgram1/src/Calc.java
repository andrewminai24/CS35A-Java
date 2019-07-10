import java.util.Scanner;

class Calc{
    public static void main(String args[]){
        Scanner func = new Scanner(System.in);
        double fnum,snum,answer;
        System.out.println("Enter your num");
        fnum = func.nextDouble();
        System.out.println("Enter Second num");
        snum = func.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}