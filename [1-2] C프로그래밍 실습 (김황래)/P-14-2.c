#include <stdio.h>

struct date {					// 구조체 date 선언
	int year;
	int month;
	int day;
};

struct student {				// 구조체 student 선언
	int id;
	char name[10];
	struct date* sd;			// 구조체 date를 가리키는 포인터 선언
};

int main(void)
{
	printf("포인터를 구조체 멤버로 선언하는 프로그램\n");

	struct date d = { 2002, 05, 05 };				// 구조체 변수 선언과 초기화
	struct student s = { 20251234, "홍길동" };

	s.sd = &d;							// 구조체 변수 s의 포인터 sd에 구조체 d의 주소 대입

	printf("1.학번 : %d\n", s.id);
	printf("2.성명 : %s\n", s.name);
	printf("3.생년월일 : %d. %d. %d. \n", s.sd->year, s.sd->month, s.sd->day);

	return 0;
}
