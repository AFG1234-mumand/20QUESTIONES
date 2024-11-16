package question.pkg13;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double C, F;

        System.out.println("please Enter the value of F");

        F = input.nextDouble();

        C = (F - 32) * 5 / 9d;
        System.out.println("the vlue of C is " + C);

    }

}
