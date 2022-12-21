#include <stdio.h>
#include <conio.h>			// _kbhit, _getch 함수가 포함된 헤더파일
#include <windows.h>		// Sleep 함수가 포함된 헤더파일

int main()
{
	int cnt = 0;

	while (1)
	{
		if (_kbhit())		// 키보드가 눌렸는지 체크해주는 함수
		{
			if (_getch() == 'q')		// 입력은 받지만 무엇을 입력했는지 보여주지 않음(눌린 값)
				break;
			else
				cnt = 0;
		}
		system("cls");		// 이전까지의 콘솔 화면의 내용을 깨끗하게 지운다.

		printf("%d", cnt);

		// Sleep 함수는 매개 변수로 사용되는 값이
		// 초 단위가 아니라 1000분의 1초 단위이기 때문
		Sleep(1000);		// 1초 지연

		cnt++;
	}
	return 0;
}
