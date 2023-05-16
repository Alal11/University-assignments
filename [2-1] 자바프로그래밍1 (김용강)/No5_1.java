// {1.0, 2.0, 3.0, 4.0} 과 같은 초기값을 가지는 double 형의 배열 생성
// 모든 배열 요소 출력
// 모든 요소의 합 출력
// 가장 큰 값 출력

public class No5_1 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.0, 3.0, 4.0};

        double sum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.printf("합은 %.1f\n", sum);
        System.out.printf("최대값은 %.1f\n", max);
    }
}

// print : 괄호안 내용을 단순히 출력. 개행문자(=줄바꿈문자=\n) 포함안됨.
// printf : C에서의 printf와 동일. %d, %s 등을 쓰기위해 사용. 개행문자 포함X
// println : 괄호안 내용을 출력한 후 마지막에 개행문자가 포함되어 있어 출력후 한 줄 띄워짐.

// printf 만 "콤마" 사용. print랑 println은 "+" 사용
