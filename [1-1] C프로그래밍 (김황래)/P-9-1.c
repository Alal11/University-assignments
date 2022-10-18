#include <stdio.h>

void CRedit(int cash);

int main(void)
{
	int input, cnt, cash = 0;

	printf("■ 정적 변수와 사용자 정의 함수를 사용한 가계부 프로그램\n");

re:
	printf("입출금 횟수 지정 (1~10) : ");
	scanf_s("%d", &input);

	if (1 <= input && input <= 10) {
		for (cnt = 1; cnt <= input; cnt++)
		{
			printf("< %d 회 실행 >\n", cnt);
			printf("현금 : ");
			scanf_s("%d", &cash);

			printf("입금\t\t출금\t\t잔액\n");
			CRedit(cash);
		}
		printf("\n총 %d회를 실행 후 프로그램 종료\n", cnt-1);
	}
	else {
		printf("허용 범위가 아닙니다.\n다시 입력하세요.\n\n");
		goto re;
	}

	return 0;
}

void CRedit(int cash)
{
	static int balance = 0;

	if (cash >= 0)
		printf("%d\t\t\t\t", cash);
	else
		printf("\t\t%d\t\t", -cash);

	balance += cash;
	printf("%d\n", balance);
}
