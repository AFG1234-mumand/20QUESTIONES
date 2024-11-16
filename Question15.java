package question.pkg15;

import java.util.Scanner;

public class Question15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c, x1, x2;
        System.out.println("please Enter price of a");
        a = input.nextDouble();
        System.out.println("please Enter price of b");
        b = input.nextDouble();
        System.out.println("please Enter price of c");
        c = input.nextDouble();

        x1 = (-b + (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
        System.out.println("x1 = " + x1);
        x2 = (-b - (Math.sqrt(b * b - 4 * a * c))) / 2 * a;
        System.out.println("x2 = " + x2);

    }

}
