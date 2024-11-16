package question.pkg16;

import java.util.Scanner;

public class Question16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please Enter your commen year ");

        int leapyear;

        leapyear = input.nextInt();
        if (leapyear % 4 == 0 && leapyear % 100 != 0 || leapyear % 400 == 0) {
            System.out.println("this year " + leapyear + " is a leapyear");
        } else {
            System.out.println("this year " + leapyear + " is not a leapyear");
        }

    }

}
