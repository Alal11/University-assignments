#include<stdio.h>
#include<windows.h>

void board(void);
void gotoxy(int x, int y);
void number(int num);


// 커서 위치 이동시키는 함수 선언
void gotoxy(int x, int y)
{
    COORD Pos = { x - 1,y - 1 };
    SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), Pos);
}

// 4 x 4 격자 모양 보드판 출력 함수 선언
void board(x,y)
{
    unsigned char a = 0xa6;
    unsigned char b[12];

    for (int i = 1; i < 12; i++)
        b[i] = 0xa0 + i;
    
    printf("%c%c", a, b[3]);
    for (int i = 0; i < 3; i++)
    {
        printf("%c%c", a, b[1]);
        printf("%c%c", a, b[1]);
        printf(" ");
        printf("%c%c", a, b[8]);
    }
    printf("%c%c", a, b[1]);
    printf("%c%c", a, b[1]);
    printf(" ");
    printf("%c%c", a, b[4]);
    printf("\n");
    
    for (int i = 0; i < 3; i++)
    {
        printf("%c%c", a, b[2]);
        for (int j = 0; j < 4; j++)
        {
            printf(" ");
            printf(" ");
            printf(" ");
            printf("%c%c", a, b[2]);
        }
        printf("\n");
        printf("%c%c", a, b[7]);
        for (int j = 0; j < 3; j++)
        {
            printf("%c%c", a, b[1]);
            printf("%c%c", a, b[1]);
            printf(" ");
            printf("%c%c", a, b[11]);
        }
        printf("%c%c", a, b[1]);
        printf("%c%c", a, b[1]);
        printf(" ");
        printf("%c%c", a, b[9]);
        printf("\n");
    }

    printf("%c%c", a, b[2]);
    for (int j = 0; j < 4; j++)
    {
        printf(" ");
        printf(" ");
        printf(" ");
        printf("%c%c", a, b[2]);
    }
    printf("\n");
    printf("%c%c", a, b[6]);
    for (int i = 0; i < 3; i++)
    {
        printf("%c%c", a, b[1]);
        printf("%c%c", a, b[1]);
        printf(" ");
        printf("%c%c", a, b[10]);
    }
    printf("%c%c", a, b[1]);
    printf("%c%c", a, b[1]);
    printf(" ");
    printf("%c%c", a, b[5]);
    printf("\n");
}

// 숫자 출력해주는 함수 선언
void number(int num)
{
    printf("%d", num);
    num++;
}


int main(void)
{
    int x, y;
    int num = 1;

    board();                // 보드판 함수 호출

    // 4 x 4 번 반복
    for (int i = 1; i <= 4; i++)
    {
        for (int j = 1; j <= 4; j++)
        {
            x = 4 * j;
            y = 2 * i;
            gotoxy(x-1,y);      // 각각의 x와 y 위치로 이동    

            number(num);        // 숫자 출력
            num++;
        }
    }
    gotoxy(1, 10);          // 커서를 보드판 아래로 옮기고 종료

    return 0;
}
