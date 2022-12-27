#include <stdio.h>
#include <windows.h>		// Sleep 함수

void alarm(int sec)			// 알람 시간 구하고 출력하는 사용자 정의 함수 선언
{
	Sleep(sec * 1000);

	printf("\a");
}

int main(void)
{
	int choice;
	int min, sec;

	printf("1. n분 후 알람\n2. n초 후 알람\n\n");
	printf("선택지를 입력하세요(1 또는 2 입력) : ");
	scanf_s("%d", &choice);

	switch (choice)
	{
	case 1:
		printf("\n몇 분 후에 알람이 울리도록 하시겠습니까? ");
		scanf_s("%d", &min);

		min *= 60;		// 초 단위로 환산

		alarm(min);

		break;

	case 2:
		printf("\n몇 초 후에 알람이 울리도록 하시겠습니까? ");
		scanf_s("%d", &sec);

		alarm(sec);

		break;
	}
	return 0;
}
