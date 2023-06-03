// 아래와 같은 필드 및 메소드를 갖는 rocket 클래스 작성
// 구분    |    속성       |     설명
//ㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 필드    |    x,y       |  현재 로켓의 위치
//ㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//        |  연습문제6.Rocket(x,y) |  생성자 메소드
// 메소드  |  toString()  |  로켓 정보를 문자열로 변환하는 메소드
//        |  MoveUp()    |  로켓의 y좌표가 1만큼 증가

class Rocket {
    // 2개의 필드 저장
    private int x;
    private int y;

    // 생성자 메소드인 Rocket의 매개변수 초기화
    public Rocket(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // toString() 메소드는 로켓 정보를 문자열로 변환하는 메소드
    public String toString() {
        return "연습문제6.Rocket [x=" + x + ", y=" + y + "]";
    }

    // MoveUp() 메소드는 로켓의 y좌표 1만큼 증가시키는 메소드
    public void MoveUp() {
        this.y += 1;
    }
}

public class No6_2 {    // RocketTest
    public static void main(String[] args) {
        // 연습문제6.Rocket 객체 obj 생성
        Rocket obj = new Rocket(10, 20);

        // toString() 메소드 호출
        System.out.println(obj.toString());

        // MoveUp() 메소드 호출
        obj.MoveUp();
        obj.MoveUp();

        // Rocket의 toString()
        System.out.println(obj);
    }
}
