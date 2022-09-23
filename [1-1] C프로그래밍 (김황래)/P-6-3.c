// switch 문
#include <stdio.h>
int main(void)
{
	char season;

	printf("계절을 선택할 알파벳 입력 : ");
	scanf_s("%c", &season, sizeof(season));

	switch (season) {
	case 'A':
	case 'a':
		printf("계절 : 봄\n");
		printf("수행 : 꽃을 가꾼다\n");
		break;

	case 'S':
	case 's':
		printf("계절 : 여름\n");
		printf("수행 : 수영을 한다\n");
		break;

	case 'D':
	case 'd':
		printf("계절 : 가을\n");
		printf("수행 : 추수를 한다\n");
		break;

	case 'F':
	case 'f':
		printf("계절 : 겨울\n");
		printf("수행 : 스키를 탄다\n");
		break;

	default:
		printf("허용되지 않는 알파벳입니다.\n");
		printf("대소문자 구별 없이 A, S, D, F만 허용됩니다.\n");
		printf("프로그램을 다시 시작하세요.\n");
	}
	return 0;
}



// if~else문
#include <stdio.h>

int main(void)
{
	char season;

	printf("계절을 선택할 알파벳 입력 : ");
	scanf_s("%c", &season, sizeof(season));

	if (season == 'A' || season == 'a') {
		printf("계절 : 봄\n");
		printf("수행 : 꽃을 가꾼다\n");
	}
	else if (season == 'S' || season == 's') {
		printf("계절 : 여름\n");
		printf("수행 : 수영을 한다");
	}
	else if (season == 'D' || season == 'd') {
		printf("계절 : 가을\n");
		printf("수행 : 추수를 한다\n");
	}
	else if (season == 'F' || season == 'f') {
		printf("계절 : 겨울\n");
		printf("수행 : 스키를 탄다\n");
	}
	else {
		printf("허용되지 않는 알파벳입니다.\n");
		printf("대소문자 구별 없이 A, S, D, F만 허용됩니다.\n");
		printf("프로그램을 다시 시작하세요.\n");
	}
	return 0;
}
