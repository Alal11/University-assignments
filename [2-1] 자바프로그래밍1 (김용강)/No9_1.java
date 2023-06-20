// 끝말잇기 게임 작성
// n명이 참가: 참가하는 인원 및 이름 입력 받음
// main을 포함하는 WordGameApp 클래스와 각 선수를 나타내는 Player 클래스로 구분하여 작성
// - 실행 중 WordGameApp 객체 하나와 참가인원만큼의 Player 객체 사용
// charAt() 참고

import java.util.*;

class WordGameApp {
    String start = "";  //시작 단어
    boolean game = true;    //게임 시작 = true, 게임 종료 = false
    public WordGameApp(String s) {
        this.start = s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> p = new ArrayList<>();  //플레이어 객체 베열

        WordGameApp wga = new WordGameApp("java");  //시작 단어를 java로 설정

        if (wga.game) {
            System.out.println("끝말잇기 게임을 시작합니다...");
            System.out.print("게임에 참가하는 인원은 몇명입니까>>");
            int n = sc.nextInt();

            for ( int i = 0 ; i < n ; i++ )
            {
                System.out.print("참가자의 이름을 입력하세요>>");
                String nm = sc.next();

                p.add(new Player(nm));
            }

            System.out.println("시작하는 단어는 "+wga.start+"입니다.");

            do {
                for (int i = 0; i < n; i++) {
                    System.out.print(p.get(i).name + ">>");
                    p.get(i).word = sc.next();

                    //시작 단어의 끝과 플레이어가 입력한 단어의 첫자가 같으면 시작 단어를 바꾸고 이어서 시작
                    if (wga.start.charAt(wga.start.length() - 1) == p.get(i).word.charAt(0)) {
                        wga.start = p.get(i).word;
                    } else {
                        System.out.println(p.get(i).name + "이 졌습니다.");
                        wga.game = false;
                        break;
                    }
                }
            } while (wga.game);
        }
    }
}
class Player {
    String name = "";   //참가자 이름
    String word = "";   //말한 단어

    public Player(String name) {
        this.name = name;
    }
}
