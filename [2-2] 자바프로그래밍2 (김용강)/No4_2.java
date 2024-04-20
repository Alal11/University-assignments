package 연습문제4;

import javax.swing.*;
import java.awt.*;

class No4_2 extends JFrame {
    public No4_2() {
        Container ct = getContentPane();
        GridLayout g1 = new GridLayout(4, 3, 10, 10);
        ct.setLayout(g1);

        for (int i = 1; i <= 10; i++) {
            ct.add(new JButton("레이아웃" + i));
        }
    }

    public static void main(String[] args) {
        No4_2 glt = new No4_2();
        glt.setTitle("GridLayout Test");
        glt.setSize(400, 200);
        glt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        glt.setVisible(true);
    }
}
