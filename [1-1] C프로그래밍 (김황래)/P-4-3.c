#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	char MJY[10];
	system("title Test 04_03");

	printf("■ 배열을 사용하여 문자열을 출력하는 프로그램\n");
	printf("문자열 입력 : ");
	scanf_s("%s", MJY, sizeof(MJY));

	printf("문자열 출력 : \"%s\"\n", MJY);
	printf("문자열 상수 주소 : ");

	printf("%X\n", MJY);

	return 0;
}
