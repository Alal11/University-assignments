#include <stdio.h>

int main(void)
{
	unsigned char a1 = 0xa1;
	unsigned char a2 = 0xa2;
	unsigned char b1 = 0xda;
	unsigned char b2 = 0xdf;
	unsigned char b3 = 0xe1;
	unsigned char b4 = 0xe3;
	unsigned char b5 = 0xbc;
	unsigned char b6 = 0xbe;
	unsigned char b7 = 0xc0;

	int num;

	printf("특수기호 출력\n");
	printf("1:★, 2:◆, 3:■, 4:▲, 5:♠, 6:♥, 7:♣\n\n");

	printf("번호를 입력하시오> ");
	scanf_s("%d", &num);

	switch (num)
	{
	case 1:
		printf("%c%c\n", a1, b1);
		break;
	case 2:
		printf("%c%c\n", a1, b2);
		break;
	case 3:
		printf("%c%c\n", a1, b3);
		break;
	case 4:
		printf("%c%c\n", a1, b4);
		break;
	case 5:
		printf("%c%c\n", a2, b5);
		break;
	case 6:
		printf("%c%c\n", a2, b6);
		break;
	case 7:
		printf("%c%c\n", a2, b7);
		break;
	default:
		return 0;
	}
	return 0;
}
