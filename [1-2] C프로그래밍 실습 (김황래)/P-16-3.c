#include <stdio.h>
#include <stdlib.h>

int main()
{
	int cnt;
	int* list;
	int* new_list;

	printf("정수 3개를 저장할 메모리 확보\n");
	list = (int*)malloc(sizeof(int) * 3);				     // 3바이트 단위로 동적 메모리 할당

	list[0] = 100;
	list[1] = 200;
	list[2] = 300;

	for (cnt = 0; cnt < 3; cnt++)
		printf("%d ", list[cnt]);
	printf("\n");

	printf("\n정수 5개를 저장할 메모리 공간으로 확장\n");
	new_list = (int*)realloc(list, sizeof(int) * 5);	// 5바이트 단위로 동적 메모리 블록 크기 변경

	new_list[3] = 400;
	new_list[4] = 500;

	for (cnt = 0; cnt < 5; cnt++)
		printf("%d ", new_list[cnt]);
	printf("\n");

	free(new_list);

	return 0;
}
