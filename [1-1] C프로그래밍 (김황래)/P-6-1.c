#include <stdio.h>

int main(void)
{
	char mj;

	printf("문자를 입력하시오 : ");
	scanf_s("%c", &mj, sizeof(mj));

	if ('A' <= mj && mj <= 'Z')
		printf("입력한 %c는(은) \"알파벳 대문자\"입니다.\n", mj);
	else if ('a' <= mj && mj <= 'z')
		printf("입력한 %c는(은) \"알파벳 소문자\"입니다.\n", mj);
	else if (mj >= '0')
		printf("입력한 %c는(은) \"숫자\"입니다.\n", mj);
	else
		printf("입력한 %c는(은) \"기타 문자\"입니다.\n", mj);

	return 0;
}
