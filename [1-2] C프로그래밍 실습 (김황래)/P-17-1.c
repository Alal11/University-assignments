// main.c 소스 파일
#include <stdio.h>
#include "ab.h"

int main()
{
	int midterm, finals;

	printf("중간고사 : ");
	scanf_s("%d", &midterm);

	printf("기말고사 : ");
	scanf_s("%d", &finals);

	float result = avg(midterm, finals);

	printf("평균 ; %.2f\n", result);

	return 0;
}


// avg.c 소스 파일
float avg(int a, int b)
{
	return (a + b) / 2.0;
}


// ab.h 헤더 파일
float avg(int a, int b);
