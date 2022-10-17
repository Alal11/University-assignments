#include <stdio.h>

void menu();
void student();
void gugugan();
void hapgye();

void main()
{
	int num;
	char input;
	
	menu();

	do {
		printf("프로그램을 선택하세요(1~3). : ");
		scanf_s("%d", &num);
		getchar();

		switch (num) {
		case 1:
			student();
			getchar();
			break;

		case 2:
			gugugan();
			getchar();
			break;

		case 3:
			hapgye();
			getchar();
			break;

		default:
			printf("\n\n선택 범위가 아닙니다. 번호를 다시 선택하세요.\n");
			continue;
		}
		printf("\n프로그램 수행 성공!\n");

	re:
			printf("프로그램을 다시 실행하겠습니까? (Y/N) : ");
			scanf_s("%c", &input, sizeof(input));
			getchar();

			switch (input) {
			case 'Y':
			case 'y':
				break;

			case 'N':
			case 'n':
				printf("\n프로그램 %d 수행 후 종료\n", num);
				return 0;
				break;

			default:
				printf("대소 문자 구별 없이 Y 또는 N만 허용됩니다.\n");
				goto re;
				break;
			}
		} while (1);
	return 0;
}

void menu()
{
	printf("1.학생 3명의 정보 입출력 프로그램\n");
	printf("2,입력한 숫자의 구구단 출력 프로그램\n");
	printf("3.1부터 입력한 숫자까지 누적 합계 출력 프로그램\n");
}

void student()
{
	char sch[20];
	int num;
	char name[10];

	printf("\n1.학생 3명의 정보 입출력 프로그램\n");
	printf("학생1의 정보 입력\n");
	printf("학교 : ");
	scanf_s("%s", sch, sizeof(sch));
	getchar();
	printf("학번 : ");
	scanf_s("%d", &num);
	printf("이름 : ");
	scanf_s("%s", name, sizeof(name));
	getchar();

	printf("\n학생1의 정보 출력\n");
	printf("1> 학교 : %s\n", sch);
	printf("2> 학번 : %d\n", num);
	printf("3> 이름 : %s\n", name);
}

void gugugan()
{
	int dan, su, gab;

	printf("\n2,입력한 숫자의 구구단 출력 프로그램\n");
	printf("출력할 단 입력 : ");
	scanf_s("%d", &dan);
	printf("< %d 단 >\n", dan);

	for (su = 1; su <= 9; su++) {
		gab = dan * su;
		printf("%d x %d = %05d : 바깥쪽 for문 (%d)일 때, 안쪽 for문 (%d)\n", dan, su, gab, dan, su);
	}
}

void hapgye()
{
	int i, num, hap = 0;
	printf("\n3.1부터 입력한 숫자까지 누적 합계 출력 프로그램\n");
	printf("누적 합계 구할 숫자 입력 : ");
	scanf_s("%d", &num);
	for (i = 1; i <= num; i++)
		hap += i;
	printf("1부터 %d까지 누적 합계는 %d\n\n", num, hap);
}
