#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
	int number[11] = { 0 };		// 중복 숫자 체크할 number 배열 0으로 초기화
	int num, sum = 0;

	while (1)			// 컴퓨터나 사용자가 승리할 때까지 무한 반복
	{
		// 컴퓨터으 차례
		srand(time(NULL));		// 무작위 난수 추출

		num = rand() % 10 + 1;	// 1부터 10까지 난수 num에 저장

		while (1)
		{
			// 중복 숫자가 아닐 때까지 난수 추출 반복
			if (number[num - 1] == 1)
				num = rand() % 10 + 1;
			else
				break;
		}
		printf("컴퓨터의 숫자 : %d\n", num);
		number[num - 1] = 1;		// 출력한 숫자에 해당하는 number 배열 값 1로 바꿔줌
		
		sum += num;					// sum에 num을 더한 누적 값 구하기
		printf("현재 합계는 %d입니다.\n\n", sum);

		if (sum > 50)		// 컴퓨터 차례에 sum이 50 초과가 되면 컴퓨터의 승리 처리
		{
			printf("~~컴퓨터의 승리! O_<\n");
			exit(0);
		}
		
		// 사용자의 차례
		printf("숫자를 입력하세요 : ");
		scanf_s("%d", &num);

		while (1)
		{	// num이 1 ~ 10 범위일 때까지 반복하여 입력받음
			if (num < 1 || num>10)
			{
				printf("\n숫자의 범위는 1 ~ 10 사이입니다!\n");
				printf("\n숫자를 입력하세요 : ");
				scanf_s("%d", &num);
			}
			// 입력한 num이 중복이 아닐 때까지 반복하여 입력받음
			else if (number[num - 1] == 1)
			{
				printf("\n이미 입력한 숫자입니다!!\n");
				printf("\n숫자를 입력하세요 : ");
				scanf_s("%d", &num);
			}
			else
				break;
		}
		number[num - 1] = 1;		// 해당 num 숫자 중복 처리
		sum += num;
		printf("현재 합계는 %d입니다.\n\n", sum);
			
		if (sum > 50)		// 사용자의 차례에 sum이 50 초과가 되면 사용자의 승리 처리
		{
			printf("~~사용자의 승리입니다! ^0^/\n");
			exit(0);
		}
	}
}
