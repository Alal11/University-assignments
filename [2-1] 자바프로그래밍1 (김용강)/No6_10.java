// 학생을 나타내는 클래스 연습문제6.Student 생성.
// - 이름과 학번, 나이를 가짐.
// - 학번은 private으로 선언.

import java.util.Scanner;

class Student{
    String name;
    private String rollno;
    int age;

    public Student(String name, String rollno, int age)
    {
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }

    public String getRollno(){
        return rollno;
    }

    public void setRollno(String rollno){
        this.rollno=rollno;
    }

    @Override
    public String toString(){
        return "연습문제6.Student [name="+name+", rollno="+rollno+", age="+age+"]";
    }
}


public class No6_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("학생의 이름: ");
        String name=sc.next();
        System.out.println("학생의 학번: ");
        String id=sc.next();
        System.out.println("학생의 나이: ");
        int age=sc.nextInt();

        Student st=new Student(name, id, age);
        // st.rollno;
        System.out.println(st);
    }
}
