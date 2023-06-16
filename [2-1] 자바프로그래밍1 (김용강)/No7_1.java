// ATM 프로그램 작성
// 연습문제7.Account 클래스를 생성하고 필요한 속성 및 메소드 추가
// 비밀번호 (1234) 입력 후 동작 / 비밀번호 잘못 입력 시 프로그램 종료
// 현금 입금 / 현금 인출 / 잔액 확인 / 종료


import java.util.Scanner;

class Account {
    private int balance;
    private double rate;
    private String pin;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    void setBalance(int accBal) {
        balance = accBal;
    }

    void setRate(double accRate) {
        rate = accRate;
    }

    void deposit(double dep) {
        balance += dep;
    }

    void withdraw(double wit) {
        balance -= wit;
    }

    int getBalance() {
        return balance;
    }

    double getRate() {
        return rate;
    }
}

public class No7_1 {  // ATM
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setBalance(0);
        a1.setRate(3.00);
        a1.setPin("1234");

        Scanner sc = new Scanner(System.in);

        System.out.print("PIN을 입력하시오: ");
        String pin = sc.nextLine();

        if (a1.getPin().equals(pin) == false) {
            System.out.println("PIN이 잘못되었습니다. ");
            return;
        }

        boolean session = true;
        while (session) {
            System.out.println("\n1. 현금 입금\n2. 현금 인출\n3. 잔액 확인\n4. 종료");
            System.out.println("번호를 입력하세요: ");
            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("입금액: ");
                    int deposit = sc.nextInt();

                    a1.deposit(deposit);
                    System.out.println("현재 잔액은 " + a1.getBalance() + "입니다.");
                    break;
                case 2:
                    System.out.println("인출액: ");
                    int withdraw = sc.nextInt();
                    if (withdraw <= a1.getBalance()) {
                        a1.withdraw(withdraw);
                        System.out.println("현재 잔액은 " + a1.getBalance() + "입니다.");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액은 " + a1.getBalance() + "입니다.");
                    break;
                case 4:
                    System.out.println("종료합니다.");
                    session = false;
                    break;
            }
        }
    }
}
