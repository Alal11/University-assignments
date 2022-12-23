#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <time.h>		// time 헤더 파일 포함

int main(void)
{
	time_t now;			// time_t 타입 : time 헤더에서 시간을 잘 다루기 위해서 만들어진 데이터 타입
	
	struct tm t;		// tm 구조체 : 멤버 변수로 년, 월, 날, 시간, 분, 초가 있어서 현재시간을 명확하게 알 수 있게 해줌

	int y, m, d, x;

	printf("특정 날짜 [년 월 일] 입력 : ");
	scanf_s("%d %d %d", &y, &m, &d);

	printf("며칠 후의 날짜를 원하십니까? : ");
	scanf_s("%d", &x);

	time(&now);		// 시스템의 현재 시간을 time_t 형태로 반환한다.
	
	t = *localtime(&now);		// 포맷팅을 위해 구조체에 넣기
	// localtime() 함수 : time() 함수로 얻은 시간의 초 정수를 struct tm에 년, 월, 일, 분, 초 등의 값으로 알아서 변환해서 반환해주는 함수
	// time_t 값을 달력 시간으로 변환하고 멤버가 있는 'tm' 구조체에 대한 포인터를 반환한다

	t.tm_year = y - 1900;
	t.tm_mon = m - 1;
	t.tm_mday = d + x;
	
	mktime(&t);		// tm 구조체를 time_t 형식으로 변환한다.

	printf("기준일로부터 %d일 후의 날짜는 %4d년 %d월 %d일입니다\n", x, t.tm_year + 1900, t.tm_mon + 1, t.tm_mday);
	
	return 0;
}
