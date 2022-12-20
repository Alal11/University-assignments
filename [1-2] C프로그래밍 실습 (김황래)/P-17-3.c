#include <stdio.h>

int main(void)
{
	unsigned char hangle[100];
	int i;

	printf("한글 문자열 입력> ");
	scanf_s("%s", hangle, sizeof(hangle));

	for (i = 0; hangle[i] != NULL; i += 2)
	{
		printf("%c%c = 0x%x 0x%x\n", hangle[i], hangle[i + 1], hangle[i], hangle[i + 1]);
	}
	return 0;
}
