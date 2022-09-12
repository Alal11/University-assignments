#include <stdio.h>
#define inch 2.54

int main(void)
{
	float ic;

	printf("■ 인치를 센티미터로 환산하는 프로그램\n");
	printf("인치 입력(소수 둘째 자리) : ");
	scanf_s("%f", &ic);


	printf("%.2f인치는 %.2f㎝입니다.\n", ic, inch * ic);

	return 0;
}
