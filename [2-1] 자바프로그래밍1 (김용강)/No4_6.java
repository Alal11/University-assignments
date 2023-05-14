// 피보나치 수열 출력
// 앞의 2개 숫자를 합하여 다음 숫자 출력 (첫 번째, 두 번째 숫자는 각각 0, 1)

import java.util.Scanner;

public class No4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("출력할 숫자 개수: ");
        num = sc.nextInt();

        int[] arr = new int[num + 3];
        String str = "";
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 0; i < num; i++) {
            arr[i + 2] = arr[i] + arr[i + 1];
            str += arr[i] + " ";
        }
        System.out.println(str);
    }
}
