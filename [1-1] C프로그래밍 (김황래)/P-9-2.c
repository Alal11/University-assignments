#include <stdio.h>

void login();

int main(void)
{
	int cnt=0;

	printf("■ 정적 지역 변수로 로그인 여부를 판별하는 프로그램\n");
	printf("for 문으로 로그인 판별 함수 3회 호출\n");

	login();

	printf("총 3회를 수행 후 프로그램을 종료합니다.\n");
	return 0;
}

void login()
{
	static int cnt;
	
	for (cnt = 1; cnt <= 3; cnt++) {
		
	if(cnt==1)
	  printf("1회 실행 : 로그인 성공\n");

	else if(cnt==2)
	  printf("2회 실행 : 현재 로그인 상태\n확인\n");

	else
	  printf("3회 실행 : 현재 로그인 상태\n확인\n"); 

  }
}
