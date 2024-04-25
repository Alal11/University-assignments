package 중간고사8;

import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 크기를 입력하세요: ");
        int size = sc.nextInt();

        // 일차원 배열 생성
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = (int) (Math.random() * 8);  // 0 ~ 7 사이 숫자 랜덤 추출
            arr2[i] = (int) (Math.random() * 8);  // 0 ~ 7 사이 숫자 랜덤 추출
        }

        System.out.print("Array 1: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n");

        System.out.print("Array 2: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("\n");

        int sum = 0;

        for (int i = 0; i < size; i++) {
            // arr1에서 한 개의 숫자 선택
            int a = arr1[i];
            arr1[i] = -1;  // 중복 방지를 위해 선택한 원소의 값을 -1로 변경

            // arr2에서 다른 한 개의 숫자 선택
            int b = 0;
            for (int j = 0; j < size; j++) {
                if (arr2[j] != -1) {        // 중복이 아닐때 실행
                    b = arr2[j];
                    arr2[j] = -1;
                    break;
                }
            }
            sum += a * b;       // 누적값
        }
        System.out.println("결과: " + sum);
    }
}
