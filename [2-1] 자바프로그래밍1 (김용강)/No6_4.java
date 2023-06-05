// 은행계좌를 클래스로 정의: 연습문제6.BankAccount 클래스 작성
// - 연습문제6.BankAccount
//      - Owner : String
//      - accountNumber : int
//      - Balance : int : 잔액
//      - deposit() : 예금 입금 메소드
//      - withdraw() : 예금 인출 메소드
// - BankAccountTest

class BankAccount {
    String owner;           // 예금주
    int accountNumber;      // 계좌번호
    int balance;            // 잔액 표시 변수

    // 예금 입금 메소드
    void deposit(int amount) {
        balance = balance + amount;
    }

    // 예금 인출 메소드
    void withdraw(int amount) {
        balance = balance - amount;
    }

    // 현재 잔액 balance를 문자열로 반환하는 메소드
    public String toString() {
        return "현재 잔액은 " + balance + "입니다.";
    }
}

public class No6_4 {  // BankAccountTest
    public static void main(String[] args) {
        // 객체 myAccount 생성
        BankAccount myAccount = new BankAccount();

        myAccount.deposit(10000);
        System.out.println(myAccount);      // toString() method

        myAccount.withdraw(8000);
        System.out.println(myAccount);      // toString() method
    }
}
