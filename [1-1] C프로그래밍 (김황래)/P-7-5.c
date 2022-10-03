#include <stdio.h>

int main(void)
{
	int su, dan, gob, cnt =1;
	char alph;

	printf("<%d 회 실행>\n", cnt);
	for (su = 9; su >= 1; su--) {
		for (dan = 9; dan >= 2; dan--) {
			gob = dan * su;
			printf("%d x %d = %02d  ", dan, su, gob);
		}
		printf("\n");
	}
re:
	do {
		printf("프로그램을 다시 실행하시겠습니까? (Y/N) : ");
		scanf_s("%c", &alph, sizeof(alph));
		getchar();

		switch (alph) {
		case 'y':
		case 'Y':
			printf("<%d 회 실행>\n", ++cnt);
			for (su = 9; su >= 1; su--) {
				for (dan = 9; dan >= 2; dan--) {
					gob = dan * su;
					printf("%d x %d = %02d  ", dan, su, gob);
				}
				printf("\n");
			}
			goto re;
		case 'n':
		case 'N':
			printf("총 %d회 실행 후 프로그램을 종료합니다.\n", cnt);
			return 0;

		default:
			printf("입력한 알파벳 \"%c\"는(은) 허용하지 않습니다.\n", alph);
			printf("알파벳을 다시 입력하세요.\n");
			goto re;
		} 
	} while (1); 
	
	return 0;
}
