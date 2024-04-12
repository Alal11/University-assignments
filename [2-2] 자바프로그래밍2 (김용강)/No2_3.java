package 연습문제2;

import java.util.Scanner;

public class No2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] counter = new int[26];
        String s = sc.nextLine();
        String[] Alph = s.split(" ");

        for (String e : Alph) {
            try {
                char ch1 = Character.toUpperCase(e.charAt(0));
                int i = ch1 - 'A';
                counter[i]++;
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println("ArrayIndexOutOfBoundsException : Input includes non-alphabet.");
            }
        }
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'A');
            System.out.println("Character " + c + ": " + counter[i]);
        }
    }
}

// 사용자로부터 단어를 읽고 각 문자의 발생 횟수 출력. 띄어쓰기로 구분.
// 문자는 모두 대문자로 변환된 다음 각 문자가 0에서 25사이의 숫자로 변환됨.
// 이것을 발생 횟수를 저장하는 배열의 인덱스로 사용. (예: A는 index 0에, B는 index 1에 ...)
// 문자가 실제로 알파벳인지 확인하는 검사는 수행되지 않음.
// 이때 알파벳이 아닌 문자가 입력되는 경우 0에서 25 사이가 아닌 인덱스가 생성되므로
// ArrayIndexOutOfBoundsException 발생.
