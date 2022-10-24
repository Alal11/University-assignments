#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void Menu();
void Heart();

int main()
{
	int num;

	do
	{
		Menu();

		scanf_s("%d", &num);

		switch (num)
		{
		case 1:
			Heart();
			break;
		case 2:
			printf("프로그램 종료!\n");
			return 0;
			break;
		default:
			printf("잘못 입력하였습니다.\n");
			break;
		}
	} while (1);
	return 0;
}

void Menu()
{
	printf("■ 랜덤 함수로 하트 찾는 프로그램\n");
	printf("1. 프로그램 실행\n");
	printf("2. 프로그램 종료\n");
	printf("번호 선택 : ");
}

void Heart()
{
	srand(time(NULL));

	int arr[10][13];
	int tag;

	int i, j, k;
	for (i = 0; i < 10; i++)
	{
		for (j = 0; j < 13; j++)
		{
			tag = rand() % 100;
			if (tag % 5 == 0)
			{
				arr[i][j] = 0;
			}
			else
			{
				arr[i][j] = 1;
			}
		}
	}

	for (i = 0; i < 10; i++)
	{
		for (j = 0; j < 13; j++)
		{
			if (arr[i][j] == 0)
			{
				printf("♥ ");
			}
			else
			{
				printf("* ");
			}
		}
		printf("\n");
	}
}
