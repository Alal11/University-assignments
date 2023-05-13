// 피타고라스의 정리를 만족하는 {a, b, c} 출력하는 문제 (a,b,c<=100)
public class No4_5 {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    if (a * a + b * b == c * c) {
                        // System.out.println("{"+a+", "+b+", "+c+"}");
                        System.out.printf("{%d %d %d}\n", a, b, c);
                    }
                }
            }
        }
    }
}
