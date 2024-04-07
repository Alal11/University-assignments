package 연습문제1;

import java.util.Scanner;

public class No1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Numerator: ");
            int a = sc.nextInt();
            System.out.print("Denominator: ");
            int b = sc.nextInt();

            try {
                System.out.println("Ceil(" + a + " / " + b + ") = " + a / b);
                break;  // break while

            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by zero. Please enter a valid input.");
            }
        }
        sc.close();
    }
}
