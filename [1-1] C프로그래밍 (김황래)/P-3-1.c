#include <stdio.h>

int main(void)
{
	int  num1, num2, num3, hap;
	float result;

	printf("1.국어 점수 : ");
	scanf_s("%d", &num1);

	printf("2.영어 점수 : ");
	scanf_s("%d", &num2);

	printf("3.수학 점수 : ");
	scanf_s("%d", &num3);

	hap = num1 + num2 + num3;
	printf("총 점 : %d\n", hap);


	result = hap / 3.0;
	printf("평균 점수 : %.2f\n", result);

	return 0;
}
