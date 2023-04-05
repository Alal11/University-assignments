// 원래 코드
//public class No2_1 {
//    public static void main(String[] args) {
//        byte b;
//        int i = 300;
//        long j = 9876543210;
//        b = i;
//        i = j;
//        System.out.println("b의 값 : " + b);
//        System.out.println("i의 값 : " + i);
//        System.out.println("j의 값 : " + j);
//    }
//}

public class No2_3 {
    public static void main(String[] args) {
        byte b;
        int i = 300;
        long j = 9876543210L;
        b = (byte) i;
        i = (int) j;
        System.out.println("b의 값 : " + b);
        System.out.println("i의 값 : " + i);
        System.out.println("j의 값 : " + j);
    }
}
