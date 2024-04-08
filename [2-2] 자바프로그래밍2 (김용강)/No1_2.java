package 연습문제1;

public class No1_2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;

        try {
            for (int i = 0; i < 5; i++) {
                arr[i + 1] = i + 1 + arr[i];
                System.out.println("intArray[" + i + "]=" + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        }
    }
}
