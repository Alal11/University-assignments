// 아래 프로그램 작성 및 결과 확인

class Static {
    public int a = 20;
    private int b = 5;
    static int c;
}

public class No6_6 {  // StaticTest
    public static void main(String[] args) {
        int a = 10;
        Static.c = a;
        Static st = new Static();

        System.out.println("클래스 변수 : " + (Static.c)++);   // 클래스 명으로 접근
        System.out.println("클래스 변수 : " + st.c);           // 객체명으로 접근
        System.out.println("변수 a : " + a);                  // 메소드 내의 변수 a
        System.out.println("변수 a : " + st.a);               // 객체 참조 변수 a
    }
}
