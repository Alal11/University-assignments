// 아래 프로그램 작성 후 결과 확인

class DD1 {
    DD1(){      // private 연습문제11.DD1()을 하면 오류 남
        System.out.println("클래스 DD1의 생성자");
    }
}

class DD2 extends DD1{
    public DD2(){
        System.out.println("클래스 DD2의 생성자");
    }
}

public class No11_2 {
    public static void main(String args[]){
        DD2 d=new DD2();
    }
}
