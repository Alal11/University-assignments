package 연습문제4;


import javax.swing.*;
import java.awt.*;

class No4_1 extends JFrame {  // JFrame 클래스로부터 상속
    public No4_1() {
        Container ct = getContentPane();
        BorderLayout b1 = new BorderLayout(10, 10);  // BorderLayout 객체를 생성. 수직, 수평 간격을 10픽셀로 설정
        ct.setLayout(b1);  // 레이아웃 설정

        // 3개의 버튼을 위치를 지정하여 프레임에 추가
        ct.add(new JButton("버튼1"), BorderLayout.NORTH);
        ct.add(new JButton("버튼2"), BorderLayout.SOUTH);
        ct.add(new JButton("버튼3"), BorderLayout.CENTER);


        JFrame jf = new JFrame("BorderLayout Test");
        JButton jb1 = new JButton("버튼1");
        JButton jb2 = new JButton("버튼2");
        JButton jb3 = new JButton("버튼3");

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        No4_1 bit = new No4_1();  // 자신의 클래스로부터 객체 생성
        bit.setTitle("BorderLayout Test");  // 프레임의 타이틀을 설정
        bit.setSize(300, 150);
        bit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bit.setVisible(true);
    }
}
