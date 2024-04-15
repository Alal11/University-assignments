package 연습문제3;

import java.io.File;
import java.util.Scanner;

public class No3_4 {
    private File currentDir = null;
    private File subFiles[] = null;

    public No3_4(String dirName) {
        currentDir = new File(dirName);
    }

    private void showSubDirtories() {
        System.out.println("\t[" + currentDir.getPath() + "]");
        subFiles = currentDir.listFiles();  // File 배열로 변환
        for (File f : subFiles) {
            System.out.print((f.isFile()) ? "file" : "dir");
            System.out.print("\t\t" + f.length() + "바이트");
            System.out.println("\t\t" + f.getName());
        }
    }

    private boolean contains(String filename) {
        for (File f : subFiles) {
            if (f.getName().equalsIgnoreCase(filename))
                return true;
        }
        return false;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("***** 파일 탐색기입니다. *****");
        showSubDirtories();

        while (true) {
            System.out.print(">>");
            String command = sc.nextLine().trim();  // 한 라인을 읽고 앞뒤에 입력한 빈칸 지우기
            if (command.equals("그만"))
                break;  // 프로그램 종료
            if (command.equals(". .")) {
                String s = currentDir.getParent();
                if (s == null)  // s가 null이면, currentDir가 현재 최상위 디렉터리라서 부모 디렉터리가 없음
                    continue;
                else {
                    currentDir = new File(currentDir.getParent());
                    showSubDirtories();
                }
            } else {  // command는 서브 디렉터리 이름
                if (contains(command)) {  // 현재 디렉터리의 파일이나 서브 디렉터리라면
                    if (new File(currentDir, command).isDirectory()) {  // 디렉터리라면
                        currentDir = new File(currentDir, command);
                        showSubDirtories();
                    } else {  // 파일인 경우
                        System.out.println("\t디렉터리가 아닙니다.!");
                    }
                }
            }
        }
        sc.close();
    }
}
