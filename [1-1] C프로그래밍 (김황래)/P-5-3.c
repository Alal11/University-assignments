#include <stdio.h>

int main(void)
{
	int num1, num2;
	int* addr1, * addr2;

	addr1 = &num1;

	addr2 = &num2;

	printf("정수 2개를 입력하시오(구분자는 콤마 사용). : ");
	scanf_s("%d, %d", &num1, &num2);

	printf("입력한 정수 2개는 %d, %d\n", num1, num2);
	printf("%d의 주소값 : %d\n", num1, addr1);     // num1의 주소 == addr1의 값 : addr1 == &num1
	printf("%d의 주소값 : %d\n", num1, &num1);     // num1의 주소 == addr1의 값 : addr1 == &num1

	printf("%d의 주소값 : %d\n", num2, addr2);

	//추력방법 3가지
	// 1) 정수값 출력 : num1, num2
	// 2) 변수의 주소 : &num1, &num2
	// 3) 변수의 주소 : addr1, addr2
	// 4) 포인터의 정수값 : *addr1, *addr2

	return 0;
