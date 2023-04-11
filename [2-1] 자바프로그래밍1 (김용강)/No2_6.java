// 문자열 String에 관해 아래 프로그램 실행 결과 확인하기

public class No2_6 {
    public static void main(String[] args) {
        String str = "420";
        str += 42;
        System.out.println(str);
        System.out.println(Integer.parseInt(str) + 100);
    }
}
