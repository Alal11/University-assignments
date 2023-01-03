#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	int num[46] = { 0 };		// 크기가 46인 num 배열 0으로 초기화

	srand(time(NULL));			// 무작위 난수를 추출함

	for (int i = 0; i < 1000; i++)		// 1000번 반복
		for (int j = 0; j < 6; j++)		  // 6번 반복
			num[rand() % 46]++;			      // 1부터 45까지 숫자가 몇 번 나왔는지 카운트

	for (int i = 0; i < 45; i++)
		printf("[%d]번 확률 : %.4f%%\n", i + 1, (num[i] / 6000.0) * 100);

	return 0;
}
