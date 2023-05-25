// 카드를 랜덤하게 선택하여 화면에 출력하는 코드 작성
// {"Clubs", "Diamonds", "Heart", "Spades"}와 {"2","3","4","5","6","7","8",
// "9","10","Jack","Queen","King","Ace"} 를 가지고 있는 문자열 배열 생성
// 5장의 카드를 랜덤하게 선택하는 코드 작성 (Math.random() 이용)

import java.util.Scanner;

public class No5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] card = {"Clubs", "Diamonds", "Heart", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int a = 0; a < 5; a++) {
            // Math.random()*size 할때 괄호로 감싸줘야 함! (+ 부분은 감쌀 필요 X)
            int i = (int) (Math.random() * card.length);
            int j = (int) (Math.random() * rank.length);

            System.out.printf("%s의 %s\n", card[i], rank[j]);
        }
    }
}
