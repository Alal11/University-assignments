#include <stdio.h>

int main(void)
{
	char alpabet, add;

	printf("알파벳 입력 : ");
	scanf_s("%c", &alpabet, sizeof(alpabet));

	printf("입력한 알파벳 : %c\n", alpabet);

	printf("알파벳 아스키코드값 : %d\n", alpabet);

	add = alpabet + 8;
	printf("입력한 알파벳 + 8 : %c\n", add);

	printf("프로그램을 종료합니다.\n");

	return 0;
}
