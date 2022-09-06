#include <stdio.h>

int main(void)
{
	char op;
	char str[12];

	printf("1.문자 입력 : ");
	scanf_s("%c", &op, sizeof(op));

	getchar();
	printf("2.문자열 입력 : ");
	scanf_s("%12s", str, sizeof(str));

	printf("문자 출력 : %c\n", op);
	printf("문자열 출력 : |%-12s\t|\n", str);

	return 0;
}
