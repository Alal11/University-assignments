#include <stdio.h>

int main(void)
{
	int num1, num2, triple;
	float division;

	printf("정수값 2개 입력 : ");
	scanf_s("%d %d", &num1, &num2);

	triple = num1 * num1 * num1;
	printf("세제곱 연산 결과 : %d * %d * %d = %08d\n", num1, num1, num1, triple);

	division = (float)num1 / num2;
	printf("나눗셈 연산 결과 : %d / %d = %08.3f\n", num1, num2, division);
  
	return 0;
}
