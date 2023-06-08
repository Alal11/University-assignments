// 아래 클래스 작성 / 결과 확인 / 오류 수정

class ScopeTest2 {
    public int radius = 20;
    private int a = 5;
    private double PI = 3.14159;

    public int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int sub(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public void area() {
        double area = a * a * PI;
    }
}

public class No6_7 {
    public static void main(String[] args) {
        ScopeTest2 st2=new ScopeTest2();
        System.out.println(st2.sub(5,3));
        System.out.println(st2.sum(5,4));
    }
}


//원래 코드
//class ScopeTest1 {
//    public int radius = 20;
//    private int a = 5;
//    private double PI = 3.14159;
//
//    public void sum(int x, int y) {
//        int sum = x + y;
//    }
//
//    public void sub() {
//        int sub = x - y;
//    }
//
//    public void area() {
//        double area = a * a * PI;
//    }
//}
