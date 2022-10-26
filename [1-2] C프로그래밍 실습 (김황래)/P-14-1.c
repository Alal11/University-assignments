#include <stdio.h>

typedef struct pummok					// 구조체 pummok 선언
	{
		char fm[20];
		int su;
		int danga;
	}mem;								// 새로운 자료형 mem 정의

int main()
{
	mem m[3];							// 구조체 배열 선언
	int cnt = 0;

	printf("구조체 배열을 사용하여 품목 3개를 처리하는 프로그램\n");
	
	// 품목 3개의 폼목, 수량, 단가를 반복 수행하여 입력
	for (cnt=0; cnt < 3; cnt++)
	{
		printf("%d번째 품목의 품목, 수량, 단가 입력\n", cnt+1);
		printf("품목 : ");
		scanf_s("%s", m[cnt].fm, sizeof(m[cnt].fm));		// 구조체 배열 변수 fm에 품목 입력

		printf("수량 : ");
		scanf_s("%d", &m[cnt].su);							// 구조체 배열 변수 su에 수량 입력

		printf("단가 : ");
		scanf_s("%d", &m[cnt].danga);						// 구조체 배열 변수 danga에 단가 입력
	}

	printf("[품목 3개의 수량, 단가, 금액 출력]\n");
	printf("상품명\t수량\t가격\t금액(천 원)\n");

	// 폼목 3개의 품목, 수량, 단가, 금액을 반복 수행하여 출력
	for (int cnt = 0; cnt < 3; cnt++)
	{
		printf("%s\t%d\t%d\t%d\n", m[cnt].fm, m[cnt].su, m[cnt].danga, m[cnt].su* m[cnt].danga);
	}
	return 0;
}
