// 4. 한 해의 모든 날에 번호를 매긴다고 가정한다. 
// (예, 1월 1일 = 1번째날, 12월 31일 = 365번째 날)
// 몇 월 몇 일이 1년에서 몇 번째 날인지 구하는 프로그램을 작성한다.
// (단 윤년의 경우는 무시한다)
// 
// ex)
//>> Enter the month : 1
//Enter the day of month : 23
//Day number : 23

#include <iostream>
using namespace std;

int main()
{
	int m, d, cnt = 0;

	cout << "Enter the month: ";
	cin >> m;
	cout << "Enter the day of month: ";
	cin >> d;

	switch (m) {
	case 1:
		break;
	case 2:
		cnt += 31;
		break;
	case 3:
		cnt += 59;
		break;
	case 4:
		cnt += 90;
		break;
	case 5:
		cnt += 120;
		break;
	case 6:
		 cnt+= 151;
		break;
	case 7:
		cnt += 181;
		break;
	case 8:
		cnt += 212;
		break;
	case 9:
		cnt += 243;
		break;
	case 10:
		cnt += 273;
		break;
	case 11:
		cnt += 304;
		break;
	case 12:
		cnt += 334;
		break;
	}
	cnt += d;
	cout << "Day number: " << cnt << "\n";
}
