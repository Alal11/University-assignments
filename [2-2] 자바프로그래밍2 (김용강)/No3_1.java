package 연습문제3;

import java.io.*;

public class No3_1 {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Enter source file and target file");
            System.exit(0);  // 프로그램을 끝낸다
        }

        File sf = new File(args[0]);
        if (!sf.exists()) {  // 파일의 현 디렉토리에 존재하지 않는가?
            System.out.println("Source file does not exist");
            System.exit(0);
        }

        File tf = new File(args[1]);
        if (tf.exists()) {
            System.out.println("Target file already exists");
            System.out.println("Overwrite? (y/n)");
            char choice = (char) System.in.read();
            // 사용자로부터 하나의 문자를 입력 받는다
            if (choice == 'n' || choice == 'N') System.exit(0);
        }

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sf));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tf));

        System.out.println("Source file : " + args[0]);

        int i;
        while ((i = bis.read()) != -1) {
            bos.write((byte) i);
        }  // 소스 파일로부터 한 바이트를 읽어서 타겟파일에 쓴다
        System.out.println("Target file : " + args[1]);

        System.out.println("Copy has been completed.");
        bis.close();
        bos.close();
    }
}



// 파일을 복사하는 프로그램 작성
// 사용자로부터 소스 파일명과 타겟 파일명을 main 함수 매개변수로 설정. (run configuration)
// 소스 파일의 내용을 타겟 파일로 복사하는 프로그램
// Directory에 iotest1.txt 파일 미리 생성
// 매개변수 입력: iotest1.txt iotest2.txt


// File 생성자
// File f1 =new File("/"); // 파일 경로만 사진 객체
// File f2=new File("/", "autoexec.bat");  // 파일의 경로와 파일 이름을 가진 객체
// new File(f2, "autoexec.bat"); // 파일의 경로를 가진 File 객체와 파일 이름을 가진 객체

// boolean canRead() // 파일 읽기 가능하면 true, 아니면false를 반환
// '' canWrite() // 쓰기 가능하면 ~~
// boolean createNewFile() // File 객체를 이용하여 파일 생성한다. 생성되면 true, 아니면 false

// 파일과 디렉터리
// String getAbsolutePath() // 파일에 대한 절대 경로를 반환
// String getCanonicalPath() // 파일에 대한 정규 경로를 반환
// String getParent()  // 부모 디렉터리 이름을 반환
// String getName() 파일의 이름을 반환
// String getPath() // 파일의 경로를 반환
// String[] list() // 지정된 디렉터리에 있는 파일과 디렉터리를 문자열 배열로 반환
// long length() 파일의 바이트 수를 반환

// -- Writer 클래스의 주요 메소드
// void close() : 출력 스트림을 닫는다.
// void flush() : 출력 버퍼에 저장된 모든 데이터를 출력 장치로 전송
// void write(int c) : c의 하위 16비트를 스트림으로 출력
// void write(Char buffer[]) : buffer 배열에 있는 문자들을 스트림으로 출력
// void write(String s) : 문자열 s를 스트림으로 출력
// void write(String s, int index, int size) : 문자열의 index 위치부터 size 크기만큼의 문자들을 스트림으로 출력

// -- Reader 클래스의 주요 메소드
// int read() : 다음 문자를 읽어 반환. 입력 스트림에 읽을 문자가 없으면 대기. 읽은 문자가 파일의 끝이면 -1을 반환
// int read(char buffer[]) : 입력 스트림으로부터 buffer 배열 크기만큼의 문자를 읽어 buffer에 저장
// int read(char buffer[], int offset, int numChars) : 입력 스트림으로부터 numChars에 지정한 만큼의 문자를 읽어
// buffe의 offset 위치에 저장하고 읽은 문자의 개수를 반환
// void mark(int numChars0 : 입력 스트림의 현재의 위치에 mark 한다.
// boolean ready() : 다음 read()문을 수행할 수 있으면 true, 입력 스트림이 없어 기다려야 되는 경우에는 false를 반환
// void reset() : 입력 스트림의 입력 시작 부분을 현재의 위치에서 가장 가까운 이전의 mark 위치로 설정
// int skip(long numChars) : numChars로 지정된 문자 수만큼을 스킵하고 스킵된 문자의 수를 반환

// FileOutputStream() : 출력 파일명 / write() : 반복문으로 파일 출력생성
// FileInputStream() : 입력 파일명 / while문으로 read() !=-1이면 내용출력
