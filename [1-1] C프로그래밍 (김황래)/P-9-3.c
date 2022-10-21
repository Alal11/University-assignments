// P-9-3-1
#include <stdio.h>

int hap;
static int A;

int main(void)
{
	printf("전역 변수를 연결하는 함수 프로그램\n");
	Out();
	printf("연산 결과 : %d\n", hap);
	
	return 0;
}


// P-9-3-2
#include <stdio.h>

extern int hap;

extern void Out(void);

void Out(int A, int B)
{
	A = 100, B = 200;
	hap = A + B;
}
