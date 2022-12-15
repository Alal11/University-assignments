#include <stdio.h>
#include <stdlib.h>

typedef struct student {
	char title[30];			// 과목 이름
	int score;				  // 점수
}ST;

int main()
{
	ST* t_zone;				// 동적 메모리 공간을 가리키는 포인터
	int cnt, max, sum = 0;
	float avg = 0.00;

	printf("입력 과목수 설정 : ");
	scanf_s("%d", &max);


	if (max<0)
	{
		printf("음의 정수는 허용하지 않습니다!\n");
		exit(1);		  	// 프로그램 비정상 종료
	}

	getchar();				// 엔터키 제거
	t_zone = (ST*)malloc(sizeof(ST)*max);	   // 동적 메모리 할당
	
	for (cnt = 0; cnt < max; cnt++)
	{
		printf("과목 : ");
		scanf_s("%s", &t_zone[cnt].title, sizeof(t_zone[cnt].title));

		printf("점수 : ");
		scanf_s("%d", &t_zone[cnt].score);

		getchar();			// 엔터키 제거
		sum += t_zone[cnt].score;

	}

	printf("\n과목\t\t\t점수\n");
	printf("--------------------------------------\n");
	for (cnt = 0; cnt < max; cnt++)
	{
		printf("%s\t\t%d\n", t_zone[cnt].title, t_zone[cnt].score);
	}

	avg = (float)sum / max;
	printf("\n총점 : %d\n", sum);
	printf("평균 : %.2f\n", avg);

	free(t_zone);			// 할당된 동적 메모리 공간 반납
	return 0;
}
