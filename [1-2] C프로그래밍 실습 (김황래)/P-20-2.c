#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	int r_num, cnt[4] = { 0 };
	int max_cnt = 0, min_cnt = 25, max_num, min_num;

	srand(time(NULL));					// 난수 생성

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			r_num = rand() % 4;		// 0 ~ 3까지 난수를 board 배열에 넣음
			cnt[r_num]++;			    // 숫자 0, 1, 2, 3이 각각 몇 번 나왔는지 cnt배열에 카운트

			printf("%d ", r_num);		// 5 x 5 크기의 정방행렬 모양으로 난수 출력
		}
		printf("\n");
	}

	// 빈도수가 가장 많은 숫자와 가장 적은 숫자를 구해줌
	for (int k = 0; k < 4; k++)
	{
		if (max_cnt <= cnt[k])
		{
			max_cnt = cnt[k];
			max_num = k;
		}

		if (min_cnt >= cnt[k])
		{
			min_cnt = cnt[k];
			min_num = k;
		}
	}
	printf("빈도가 가장 많은 숫자 : %d\n", max_num);

	printf("빈도가 가장 적은 숫자 : %d\n", min_num);
}
