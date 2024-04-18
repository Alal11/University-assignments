package 연습문제3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class No3_6 {
    // XOR 암호화에 사용할 키를 정의한다
    static byte[] key = {10, 20, 30, 40};

    public static void main(String[] args) throws Exception {
        System.out.println("xorEncoding begins.");

        // 암호화 할 원본 파일과 암호화 된 파일의 입출력 스트림을 생성한다.
        FileInputStream is = new FileInputStream("testXorEnc.txt");
        FileOutputStream os = new FileOutputStream("testXorEnc.enc");

        byte[] data = new byte[1024];
        int read = is.read(data);
        int index = 0;
        while (read != -1) {
            // 데이터를 XOR 연산을 통해 암호화한다
            for (int k = 0; k < read; k++) {
                data[k] = key[index % key.length];
                index++;
            }
            // 암호화 한 데이터를 출력 파일에 쓰기한다.
            os.write(data, 0, read);
            // 다음 블록을 읽는다.
            read = is.read(data);
        }

        // 출력 스트림을 비우고 닫는다.
        os.flush();
        os.close();
        // 입력 스트림을 닫는다.
        is.close();
    }
}
