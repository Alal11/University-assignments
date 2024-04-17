package 연습문제3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class No3_5 {
    private Vector<String> wordVector = new Vector<String>();

    public No3_5() {
    }  // 원래 이름은 WordSearch

    private boolean readFile() {  // words.txt 파일 읽기
        try {
            Scanner fsc = new Scanner(new FileInputStream("words.txt"));
            while (fsc.hasNext()) {
                wordVector.add(fsc.nextLine());  // 한 라인에 하나의 단어
            }
            fsc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No words.txt");
            return false;
        }
        System.out.println("words.txt has been found");
        return true;
    }

    private void processQuery() {  // 단어 검색
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean found = false;
            System.out.print("Words>>");
            String searchWord = sc.nextLine();  // 검색할 단어 입력
            if (searchWord.equals("Exit")) {
                break;  // 검색 종료
            }

            // 벡터에서 검색
            for (int i = 0; i < wordVector.size(); i++) {
                String word = wordVector.get(i);  // 벡터 내의 문자열
                if (word.length() < searchWord.length())  // 벡터의 문자열이검색 문자열보다 짧은 경우
                    continue;

                // 벡터 문자열의 앞부분을 검색 문자열 크기만큼 잘라내기
                String frontPart = word.substring(0, searchWord.length());

                if (searchWord.equals(frontPart)) {  // 검색 문자열과 잘라낸 앞 부분 비교
                    System.out.println(word);  // 벡터에서 발견한 단어 출력
                    found = true;
                }
            }
            if (!found) {  // 한 단어도 발견 못 한 상태
                System.out.println("Not found");
            }
        }
        sc.close();
    }
}
