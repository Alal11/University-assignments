package 연습문제4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class No4_3 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JLabel j1;

    public No4_3() {
        
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JButton jb1 = new JButton("1학년");
        JButton jb2 = new JButton("2학년");
        JButton jb3 = new JButton("3학년");
        JButton jb4 = new JButton("4학년");

        j1 = new JLabel("");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        ct.add(jb1);
        ct.add(jb2);
        ct.add(jb3);
        ct.add(jb4);
        ct.add(j1);

        setTitle("Event Test1");
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        j1.setText(e.getActionCommand());
    }

    public static void main(String[] args) {
        new No4_3();
    }
}
