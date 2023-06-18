// 사용자가 읽은 책과 평점을 저장하는 객체 배열 생성
// 연습문제7.Book 객체 생성
// ArrayList 사용 / 예시: ArrayList<연습문제7.Book> list = new ArrayList();

import java.util.ArrayList;
import java.util.Scanner;


class Book{
    String title;
    int score;

    public String getTitle(){
        return title;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score=score;
    }

    @Override
    public String toString(){
        return "연습문제7.Book [title="+title+", score="+score+"]";
    }

    static int count;       // 정적 필드

    public Book(String title, int score)
    {
        this.title=title;
        this.score=score;
        count++;
    }
}

public class No7_2 {  // BookTest
    public static void main(String[] args) {
        ArrayList<Book> list =new ArrayList();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("============================");
            System.out.println("1. 책 등록\n2. 책 검색\n3. 모든 책 출력\n4. 종료");
            System.out.println("============================");

            System.out.print("메뉴를 선택하시오: ");
            int menu=sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1:
                    System.out.print("책 제목: ");
                    String title=sc.nextLine();
                    System.out.print("책 평점: ");
                    int score=sc.nextInt();
                    list.add(new Book(title, score));
                    break;
                case 2:
                    System.out.print("책 제목: ");
                    String title2=sc.nextLine();
                    for(Book e: list){
                        if(e.getTitle().equals(title2))
                        {
                            System.out.println(e);
                        }
                    }
                    break;
                case 3:
                    for(Book e:list)
                    {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    System.out.println("종료합니다");
                    return;
            }
        }
    }
}
