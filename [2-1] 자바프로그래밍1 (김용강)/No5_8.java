// 학생들의 답안을 채점하는 프로그램을 작성. 다음과 같은 2차원 배열이 학생들이 제출한 답.
// 모든 문제는 객관식으로 1~4 사이의 정답을 가짐. 5명의 학생들이 각각 10문제에 대한 답을
// 다음과 같이 제출. 문제의 정답은 프로그램 실행 시에 주어짐. (아래 값으로 배열 초기화)
// 학생1 : 1 3 2 4 3 1 4 2 2 1
// 학생2 : 3 2 4 2 2 1 1 3 4 1
// 학생3 : 2 4 3 2 1 2 1 3 3 4
// 학생4 : 2 3 3 1 1 3 2 2 4 4
// 학생5 : 3 1 1 2 4 1 2 3 1 3


import java.util.Scanner;

public class No5_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int student[][] = {
                {1, 3, 2, 4, 3, 1, 4, 2, 2, 1},
                {3, 2, 4, 2, 2, 1, 1, 3, 4, 1},
                {2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
                {2, 3, 3, 1, 1, 3, 2, 2, 4, 4},
                {3, 1, 1, 2, 4, 1, 2, 3, 1, 3}
        };
        int answer[] = new int[10];


        System.out.print("정답을 입력하세요(10개) : ");
        for (int i = 0; i < 10; i++) {
            answer[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int score = 0;
            for (int j = 0; j < answer.length; j++) {
                if (student[i][j] == answer[j]) {
                    score += 1;
                }
            }
            System.out.println("학생" + (i + 1) + "의 점수 : " + score + "점");
        }
    }
}
