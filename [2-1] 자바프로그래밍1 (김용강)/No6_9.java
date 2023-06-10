// 원의 넓이를 구하기 위한 프로그램. 원의 특성을 나타내는 클래스(SimpleCicle)를 아래와
// 같이 정의할 때, 클래스 변수 PI를 이용하여 원의 넓이를 구하는 프로그램 작성

import java.util.Scanner;

class SimpleCircle{
    static final double PI=3.14159;
}


public class No6_9 {  // SimpleCicleTest1
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요 : ");
        double radius=sc.nextInt();

        System.out.println("원의 반지름은 : "+radius);
        System.out.println("원의 넓이는  : "+radius*radius*SimpleCircle.PI);

        SimpleCircle c1=new SimpleCircle();
        SimpleCircle c2=new SimpleCircle();

        System.out.println("클래스 "+ SimpleCircle.PI);
        System.out.println("객체1 "+c1.PI);
        System.out.println("객체2 "+c2.PI);
    }
}
