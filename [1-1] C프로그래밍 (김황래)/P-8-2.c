#include <stdio.h>

void hanoi(int n, char tmp, char from, char to) {			        // n원판갯수
	if (n == 1)
		printf("원판 1 : 탑 %c => 탑 %c 로 이동\n", from, to);
	else
	{
		hanoi(n - 1, from, to, tmp);
		printf("원판 %d : 탑 %c => 탑 %c 로 이동\n", n, from, to);
		hanoi(n - 1, tmp, from, to);
	}
}

int main(void)
{
	char input;
	
	printf("[ 탑의 원판 이동하는 함수 호출 ]\n\n");
	hanoi(3, 'A', 'B', 'C');
	printf("\n원판을 모두 이동하였습니다.\n");

	do {
		
	re:
		printf("프로그램을 다시 실행하겠습니까? (Y/N) : ");
		scanf_s("%c", &input, sizeof(input));
		getchar();

		switch (input) {
		case 'Y':
		case 'y':
			hanoi(3, 'A', 'B', 'C');
			printf("\n원판을 모두 이동하였습니다.\n");
			break;

		case 'N':
		case 'n':
			break;

		default:
			printf("\n%c는(은) 허용되지 않는 알파벳입니다.\n", input);
			printf("알파벳을 다시 입력하세요.\n\n");
			goto re;
		}
		if(input=='n'||input=='N')
		break;
	} while (1);
	return 0;
}
