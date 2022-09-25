#include <stdio.h>

int main(void)
{
	int cnt = 0;
	char alph;

	
	while (1) {
		
		printf("\n알파벳 입력 : ");
		scanf_s("%c", &alph, sizeof(alph));
		getchar();
		cnt++;
	
		if (alph == 'q' || alph == 'Q') {
			printf("총 %d회 실행하여 알파벳을 찾았습니다.\n", cnt);
			printf("찾은 알파벳은 대소 문자 구별 없이 '%c' 입니다.\n", alph);
			break;
		}
		else
			printf("찾는 알파벳이 아닙니다. 알파벳을 다시 입력하세요.\n");
	}
	return 0;
}
