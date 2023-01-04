#include <stdio.h>
#include <windows.h>
#include <conio.h>

// 커서 위치 이동시키는 함수
void gotoxy(int x, int y) {
	COORD pos = { x, y };
	SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), pos);
}

// 사각형 출력해주는 함수
void square(void) {
	printf("\n ┏━━━━━━━━━━━━━━━━━━━━┓\n");

	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");
	printf(" ┃\t\t      ┃\n");

	printf(" ┗━━━━━━━━━━━━━━━━━━━━┛");

}

int main()
{
	int x, y, i, j, nx = 14, ny = 9;
	char in = 75, in_buff = 75;

	// 무한 반복문
	while (1)
	{
		square();

		// x, y 좌표 위치 이동시켜 준다
		switch (in)
		{
		case 75:
			if (nx <= 12 && ny > 6) {
				nx -= 2;
				ny--;
				break;
			}
			else if (nx <= 10 && ny <= 6) {
				nx += 2;
				ny--;
				break;
			}
			else if (nx >= 6 && ny < 6) {
				nx += 2;
				ny++;
				break;
			}
			else if (nx >= 12 && ny >= 6) {
				nx -= 2;
				ny++;
				break;
			}
		case 77:
			if (nx < 12 && ny >= 6) {
				nx += 2;
				ny++;
				break;
			}
			else if (nx >= 12 && ny > 6) {
				nx += 2;
				ny--;
				break;
			}
			else if (nx > 12 && ny <= 6) {
				nx -= 2;
				ny--;
				break;
			}
			else if (nx <= 12 && ny < 6) {
				nx -= 2;
				ny++;
				break;
			}
		}

		// 커서 이동시키고 공 출력
		gotoxy(nx, ny);
		printf("○");

		// 벽에 닿은 경우의 입력받은 방향키 값을 buff 변수에서 실제 in 변수로 넣어준다.
		if ((nx == 12 && ny == 10) || (nx == 4 && ny == 6) || (nx == 12 && ny == 2) || (nx == 20 && ny == 6))
			if (in_buff == 75 || in_buff == 77) 
				in = in_buff;

		if (_kbhit())				    // _kbhit() : 키보드가 눌렸는지 체크해주는 함수
			in_buff = _getch();		// _getch() : 키보드 입력 받고 출력은 해주지 않는 함수

		gotoxy(22, 13);		// 커서 위치 이동
		Sleep(1000);		  // 1초씩 시간 지연
		system("cls");		// 이전까지 출력한 것을 모두 지워줌
	}
}
