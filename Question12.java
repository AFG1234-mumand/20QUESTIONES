package question.pkg12;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double area, PI, R;
        System.out.println("please Enter the R");
        
        R = input.nextDouble();
        PI = 3.14159;

        area = PI * R * R;
        System.out.println("the area is " + area);
    }

}
