#include <stdio.h>
#define DT 5

double sum(double* array, int size);

int main(void)
{
	double num[DT] = { 12.3, 35.8, 57.29, 96.53, 28.37 };

	printf("■ 1차원 배열 요소의 덧셈 연산 결과를 출력하는 프로그램\n");
	printf("제시>> list[5] = {12.3, 35.8, 57.29, 96.53, 28.37}\n");
	printf("호출>> 사용자 정의 함수에서 배열 요소의 합계 산출\n");
	printf("\n\t>>>>> 사용자 정의 함수 영역 <<<<<\n\n");
	
	 sum(num, DT);
	 
	printf("반환>> 사용자 정의 함수 -> 메인 함수\n");
	printf("결과>> 배열 요소의 합계 : %.2f\n", sum(num, DT));

	return 0;
}

double sum(double* array, int size)
{
	int cnt;
	double result = 0;
	
	for (cnt = 0; cnt < size; cnt++)
		result += array[cnt];

	return result;
}
