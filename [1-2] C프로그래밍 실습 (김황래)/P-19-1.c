#include <stdio.h>
#include <Windows.h>			// gotoxy 함수 사용하기 위한 헤더 파일

void gotoxy(int x, int y);
void basic_square(void);


void gotoxy(int x, int y)		// 커서의 위치를 이동시키는 함수
{
	COORD pos = { x,y };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);
}


void basic_square(x, y)			// 정사각형 하나를 출력해주는 함수
{
	unsigned char a = 0xa6, b[7];

	for (int i = 1; i < 7; i++)
		b[i] = 0xa0 + i;

	printf("%c%c", a, b[3]);
	gotoxy(x + 1, y);
	printf("%c%c", a, b[1]);
	printf("%c%c", a, b[4]);
	printf("\n");
	gotoxy(x, y + 1);
	printf("%c%c", a, b[6]);
	gotoxy(x + 1, y + 1);
	printf("%c%c", a, b[1]);
	printf("%c%c", a, b[5]);
	printf("\n");
}


int main(void)
{
	int x, y;

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			// 특정 간격만큼 위치 이동시켜 줌
			x = j * 4;
			y = i * 2;

			gotoxy(x, y);
			basic_square(x, y);
		}
	}
	printf("\n");
	return 0;
}


// 1.  커서의 위치를 이동시키는 gotoxy 함수를 좌표 x와 y를 매개변수로 하도록 선언해준다.
// 2. 정사각형을 하나 출력해주는 사용자 정의 함수 basic_square을 선언해주는데, 좌표 x와 y를 매개변수로 하여 정사각형의 위치를 옮길 수 있도록 gotoxy 함수를 각 위치에 맞게 호출해준다.
// 3. main 함수로 와서 이중 for문을 이용하여 5 x 5만큼 반복해준다.
// 4. 위치를 옮기기 위해 좌표 x와 y를 특정 간격으로 각각 곱해주고 gotoxy() 함수와 basic_square() 함수를 호출한다.
