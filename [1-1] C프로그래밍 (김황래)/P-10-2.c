#include <stdio.h>

#define SR 2
#define SC 3
#define DR 3
#define DC 20

int main()
{
	int score[SR][SC] = { 0 };
	char det[DR][DC] = { "국어 점수", "영어 점수", "수학 점수" };

	int i, j;
	int sum = 0;
	double avg = 0.0;

	for (i = 0; i < SR; i++)
	{
		printf("문>> [ %d번째 ] 학생의 %d개 과목 점수를 입력하시오.\n", i + 1, SC);
		sum = 0;
		for (j = 0; j < SC; j++)
		{
			printf("%s : ", det[j]);
			scanf_s("%d", &score[i][j]);

			sum += score[i][j];
		}
		avg = (double)sum / SC;

		printf("답>> 평균 점수 : %.2f\n\n", avg);
	}

	return 0;
}
