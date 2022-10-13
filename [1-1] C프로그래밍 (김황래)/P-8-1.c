#include <stdio.h>

void cm(float gab);				// 사용자 정의 함수 선언 1
void m2(float gab);				// 사용자 정의 함수 선언 2

int main(void)
{
	float input;
	char op;

	do {
		printf("A. 인치를 센티미터로 환산하는 프로그램\n");
		printf("B. 평을 평방미터로 환산하는 프로그램\n");
		printf("Q. 프로그램 종료\n\n");
		printf("선택 : ");
		scanf_s("%c", &op, sizeof(op));
		getchar();

		if (op == 'a' || op == 'A') {
			printf("A. 인치를 센티미터로 환산 프로그램\n");
			printf("문> 인치(inchi)를 입력하세요 : ");
			scanf_s("%f", &input);
			getchar();

			printf("\n[ 인치를 센티미터로 환산 함수 호출 ]\n\n");
			cm(input);				// 사용자 정의 함수 호출 1
		}
		else if (op == 'b' || op == 'B') {
			printf("B. 평을 평방미터로 환산 프로그램\n");
			printf("문> 평을 입력하세요 : ");
			scanf_s("%f", &input);
			getchar();

			printf("\n[ 평을 평방미터로 환산 함수 호출 ]\n\n");
			m2(input);				// 사용자 정의 함수 호출 2
		}
		else if (op == 'q' || op == 'Q') {
			printf("프로그램을 종료합니다.\n");
			return 0;
		}
		else
			continue;
	} while (1);
	return 0;
}

void cm(float gab)				// 사용자 정의 함수 정의 1
{
	printf("답> %.2f인치(inchi)는 %.2f센티미터(cm)\n\n", gab, gab * 2.5399);
	printf("성공적으로 환산을 수행하였습니다.\n\n");
}

void m2(float gab)				// 사용자 정의 함수 정의 2
{
	printf("답> %.2f평은 %.2f평방미터\n\n", gab, gab * 3.3058);
	printf("성공적으로 환산을 수행하였습니다.\n\n");
}
