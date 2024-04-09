package 연습문제1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class No1_3 {
    public static void main(String[] args) {

        System.out.println("Please enter three integer values:");

        int sum = 0, num;
        for (int i = 0; i < 3; i++) {
            while (true) {
                Scanner sc = new Scanner(System.in);
                try {
                    System.out.print(i + ">>");
                    num = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Not an integer. Please try again.");
                }
            }
            sum += num;
        }
        System.out.println("Results: " + sum);
    }
}
