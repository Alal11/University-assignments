#include <stdio.h>

int main(void)
{
	int a, b;
	char* addr;

	printf("점수 입력 : ");
	scanf_s("%d", &a);

	if (0 > a || a > 100) {
		printf("입력한 점수 %d는(은) 허용 구간이 아닙니다.\n", a);
		printf("프로그램을 다시 실행하세요.\n");
	}
	else {
		b = a / 5;

		switch (b)
		{
		case 20:
		case 19:
			addr = "A+";
			break;

		case 18:
			addr = "A0";
			break;

		case 17:
			addr = "B+";
			break;

		case 16:
			addr = "B0";
			break;

		case 15:
            addr = "C+";
			break;

		case 14:
            addr = "C0";
			break;

		case 13:
            addr = "D+";
			break;

		case 12:
            addr = "D0";
			break;

		default:
            addr = "F";
			break;
	}
	printf("입력한 점수 : %d\n", a);
	printf("점수 등급 : %s 학점\n", addr);
		}
	return 0;
}
