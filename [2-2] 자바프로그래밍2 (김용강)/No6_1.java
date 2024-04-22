package 연습문제6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class No6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print(i + "번째 학생의 이름과 전화번호를 입력하세요 (공백으로 분리) : ");

            String name = sc.next();
            String number = sc.next();

            String filePath = "C:\\Users\\finge\\Desktop\\phone.txt";  // 파일 경로

            try {
                FileWriter fileWriter = new FileWriter(filePath);
                fileWriter.write(name);
                fileWriter.write(number);

                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
