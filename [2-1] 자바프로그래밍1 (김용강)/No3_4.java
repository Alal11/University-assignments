// 369 게임
// 1. 1~50까지의 정수에 대해 아래와 같이 출력되는 프로그램 작성
// 2. 반복문 안에 조건문 작성
//    for(int i=1; i<=50; i++){
//        조건문 작성
//    }
public class No3_4 {
    public static void main(String[] args) {
        String a = "짝 ";

        for (int i = 1; i <= 50; i++) {
            if (String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9"))
                System.out.print(a);
            else System.out.print(i + " ");
        }
    }
}
