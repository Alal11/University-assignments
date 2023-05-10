// 2와 100 사이의 수 중 소수를 찾아 출력하는 문제

public class No4_4 {
    public static void main(String[] args) {
        int[] arr = new int[101];

        for (int i = 2; i <= 100; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= 100; i++) {
            if (arr[i] == 0)
                continue;
            for (int j = i * 2; j <= 100; j += i) {
                arr[j] = 0;
            }
        }
        String str = "";

        for (int k = 2; k <= 100; k++) {
            if (arr[k] != 0)
                str += arr[k] + " ";
        }
        System.out.println("2부터 100사이 모든 소수 : " + str);

    }
}
