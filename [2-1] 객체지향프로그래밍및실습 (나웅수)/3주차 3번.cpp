// 3. 초 단위의 시간을 입력받아 시, 분, 초 단위로 나누어서 변환하라
// 
//ex) 39250을 입력할 시, 10 시간, 54분, 10초 등으로 표현해서 출력
//
//-- > Enter a positive integer for the number of seconds : 4000
//Given duration in seconds : 4000
//Result : 1 hours, 6 minutes, and 40 seconds.

#include <iostream>
using namespace std;

int main()
{
	int time;

	cout << "Given duration in seconds: ";
	cin >> time;

	int h, m, s;

	h = time / 3600;
	m = (time % 3600) / 60;
	s = (time % 3600) % 60;

	cout << "Result: " << h << " hours, " << m << " minutes, and " << s << " seconds.";

}
