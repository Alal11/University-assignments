package 연습문제2;

import java.util.Scanner;

public class No2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] stringNumber = {"23", "12", "3.141592"};

        for (int i = 0; i < stringNumber.length; i++) {
            try {
                System.out.println("Value converted to integer: " + Integer.parseInt(stringNumber[i]));

            } catch (NumberFormatException e) {
                System.out.println(stringNumber[i] + " cannot be converted to integer.");
            }
        }
    }
}
