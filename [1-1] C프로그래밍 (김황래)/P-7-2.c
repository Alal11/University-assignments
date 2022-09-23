#include <stdio.h>

int main(void)
{
	int num, cnt, hap = 0;

reset:
	printf("정수값 입력 : ");
	scanf_s("%d", &num);

	if (num > 0) {
		for (cnt = 0; cnt <= num; cnt++)
			if ((cnt % 2) != 0)
				continue;
			else {
				hap += cnt;
			}
		printf("1부터 %d까지 짝수의 누적 합계는 %d\n", num, hap);

	}
	else {
		printf("음의 정수값 %d는(은) 허용하지 않습니다.\n", num);
		printf("양의 정수값을 다시 입력하세요.\n");
		goto reset;
	}
	return 0;
}
