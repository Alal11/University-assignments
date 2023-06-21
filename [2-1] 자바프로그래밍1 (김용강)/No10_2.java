// 두 개의 수를 입력 받아 큰 수를 출력하는 프로그램 작성
// 두 수를 비교하는 메소드 max를 정수(int)와 실수(double)로 구분하여 오버로딩 기법으로 구현

class Max{
    int a1;
    int a2;
    double b1;
    double b2;

    public int test(int a1, int a2)
    {
        if(a1>a2)
            return a1;
        else return a2;
    }
    public double test(double b1, double b2){
        if(b1>b2)
            return b1;
        else return b2;
    }
}

public class No10_2 {
    public static void main(String[] args) {
        Max mt = new Max();

        int r=mt.test(4,6);
        double r1=mt.test(4.2,6.1);

        System.out.println("두 정수 중 큰 값은 "+r);
        System.out.println("두 실수 중 큰 값은 "+ r1);
    }
}
