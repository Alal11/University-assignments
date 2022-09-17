#include <stdio.h>

int main(void)
{
	int num1, val;
	int* poval;

	poval = &num1;

	/*
	'*' 스타 연산자의 사용법
	1. 포인터연산자 선언
	2. 포인터 연산자가 가리키는 변수의 저장값
	*/

	printf("키보드로 정수 1개를 입력하시오 : ");
	scanf_s("%d", &num1);
	val = *poval;

	printf("키보드로 입력한 값이 저장된 주소(16진수 표기) : %x\n", poval);
	printf("포인터 변수 *poval에 저장된 값(10진수 표기) : %d\n", val);
	printf("포인터 변수 *poval에 저장된 값(10진수 표기) : %d\n", poval);

	return 0;
}
