import 연습문제10.Concert;

// 좌석: S석, A석, B석으로 구분. 각각 10개의 좌석이 있음
// 메뉴: 예약 / 조회 / 취소 / 끝내기
// 예약은 한 자리만 가능. 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력 받아 예약.
// 조회는 모든 좌석 출력.
// 취소는 예약자의 이름을 입력 받아 취소.

// 기능별로 클래스(및 파일) 구분하여 작성

// 프로그램 구성 예시
//  - 연습문제10.Seat.java : 좌석 각각에 대한 관리
//  - 연습문제10.Group.java : S, A, B 그룹 별 좌석 관리
//  - 연습문제10.Concert.java : 콘서트 관련 기능 관리
//  - 연습문제10.ConcertApp.java : 연습문제10.Concert 객체 생성 및 프로그램 시작

public class ConcertApp {
    public static void main(String[] args) {
        Concert c = new Concert();
    }
}

// ---

import 연습문제10.Group;

public class Seat extends Group {
    boolean sSeatFill[] = new boolean[10];
    boolean aSeatFill[] = new boolean[10];
    boolean bSeatFill[] = new boolean[10];

    public Seat() {
        for ( int i = 0 ; i < S.length ; i ++ ) {
            sSeatFill[i] = false;
        }
        for ( int i = 0 ; i < A.length ; i ++ ) {
            aSeatFill[i] = false;
        }
        for ( int i = 0 ; i < B.length ; i ++ ) {
            bSeatFill[i] = false;
        }
    }   // 각각 좌석이 꽉 차있는 지 판단하기 위해 false로 초기화 해줌

    public void reserve(int s, int sn, String n) {
        switch(s) {
            case 1:
                if ( S[sn-1] == null && sSeatFill[sn-1] == false ) {
                    S[sn-1] = n;
                    sSeatFill[sn-1] = true;
                    break;
                }
                else {
                    System.out.println("해당 좌석은 이미 예약된 좌석입니다.");
                    break;
                }
            case 2:
                if ( A[sn-1] == null && aSeatFill[sn-1] == false ) {
                    A[sn-1] = n;
                    aSeatFill[sn-1] = true;
                    break;
                }else {
                    System.out.println("해당 좌석은 이미 예약된 좌석입니다.");
                    break;
                }
            case 3:
                if ( B[sn-1] == null && bSeatFill[sn-1] == false ) {
                    B[sn-1] = n;
                    bSeatFill[sn-1] = true;
                    break;
                }else {
                    System.out.println("해당 좌석은 이미 예약된 좌석입니다.");
                    break;
                }
        }
    }
    public void removeReservation(int s, String n) {
        switch (s) {
            case 1:
                int c1 = countName(s, n);
                for ( int i = 0 ; i < S.length ; i++ ) {
                    if ( n.equals(S[i]) && c1 != 0 ) {
                        S[i] = null;
                        sSeatFill[i] = false;
                        break;
                    }else if ( i == S.length-1 && c1 == 0 ) {
                        System.out.println("존재하지 않는 이름입니다. 다시 입력해주세요.");
                    }else {
                        continue;
                    }
                }
                break;
            case 2:
                int c2 = countName(s, n);
                for ( int i = 0 ; i < A.length ; i++ ) {
                    if ( n.equals(A[i]) && c2 != 0 ) {
                        A[i] = null;
                        aSeatFill[i] = false;
                        break;
                    }else if ( i == A.length-1 && c2 == 0 ) {
                        System.out.println("존재하지 않는 이름입니다. 다시 입력해주세요.");
                    }
                    else {
                        continue;
                    }
                }
                break;
            case 3:
                int c3 = countName(s, n);
                for ( int i = 0 ; i < B.length ; i++ ) {
                    if ( n.equals(B[i]) && c3 != 0 ) {
                        B[i] = null;
                        bSeatFill[i] = false;
                        break;
                    }else if ( i == B.length-1 && c3 == 0 ) {
                        System.out.println("존재하지 않는 이름입니다. 다시 입력해주세요.");
                    }else {
                        continue;
                    }
                }
                break;
        }
    }
    int countName(int sn, String Name) {
        int count = 0;
        switch(sn) {
            case 1:
                for ( int i = 0 ; i < S.length ; i++ ) {
                    if (Name.equals(S[i])) {
                        count++;
                    }
                }
                break;
            case 2:
                for ( int i = 0 ; i < A.length ; i++ ) {
                    if (Name.equals(A[i])) {
                        count++;
                    }
                }
                break;
            case 3:
                for ( int i = 0 ; i < B.length ; i++ ) {
                    if (Name.equals(B[i])) {
                        count++;
                    }
                }
                break;
        }
        return count;
    }
}


// ---

public class Group {
    String S[];     // S석
    String A[];     // A석
    String B[];     // B석

    public Group() {    // 각각 10갸의 좌석이 있음
        S = new String[10];
        A = new String[10];
        B = new String[10];
    }

    public void check_S() {     // S좌석 조회
        System.out.print("S>> ");
        for ( int i = 0 ; i < S.length ; i++ ) {
            if ( S[i] == null ) {
                System.out.print("--- ");
            }else {
                System.out.print(S[i]+" ");
            }
        }
        System.out.println("");
    }
    public void check_A() {     // A좌석 조회
        System.out.print("A>> ");
        for ( int i = 0 ; i < A.length ; i++ ) {
            if ( A[i] == null ) {
                System.out.print("--- ");
            }else {
                System.out.print(A[i]+" ");
            }
        }
        System.out.println("");
    }
    public void check_B() {     // B좌석 조회
        System.out.print("B>> ");
        for ( int i = 0 ; i < B.length ; i++ ) {
            if ( B[i] == null ) {
                System.out.print("--- ");
            }else {
                System.out.print(B[i]+" ");
            }
        }
        System.out.println("");
    }
    public void checkSeat() {   // 2. 좌석 조회 기능
        check_S();
        check_A();
        check_B();
    }
}


// ---

import java.util.*;

public class Concert {
    private final Seat seat;
    private final Scanner scanner;

    public Concert() {
        seat = new Seat();
        scanner = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            switch (scanner.nextInt()) {
                case 1:
                    reserveSeat();
                    break;
                case 2:
                    seat.checkSeat();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;
                case 3:
                    cancelSeat();
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void reserveSeat() {
        int seatType = getSeatType();
        if (seatType == -1) return;

        System.out.print("이름 >> ");
        String name = scanner.next();

        System.out.print("번호 >> ");
        int seatNumber = scanner.nextInt();

        seat.reserve(seatType, seatNumber, name);
    }

    private void cancelSeat() {
        int seatType = getSeatType();
        if (seatType == -1) return;

        System.out.print("이름 >> ");
        String name = scanner.next();

        seat.removeReservation(seatType, name);
    }

    private int getSeatType() {
        System.out.print("좌석구분 S(1), A(2), B(3) >> ");
        int seatType = scanner.nextInt();
        switch (seatType) {
            case 1:
                seat.check_S();
                return 1;
            case 2:
                seat.check_A();
                return 2;
            case 3:
                seat.check_B();
                return 3;
            default:
                System.out.println("잘못된 값입니다. 번호를 다시 입력해주세요.");
                return -1;
        }
    }
}
