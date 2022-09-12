#include <stdio.h>

int main(void)
{
	const float  mile = 1.61;
	float km;

	printf("■ 마일을 킬로미터로 환산하는 프로그램\n");
	printf("mile 입력(소수점이하 2자리) : ");
	scanf_s("%f", &km);

	printf("%.2f마일은 %.2fkm입니다.\n", km, mile * km);

	return 0;
}
