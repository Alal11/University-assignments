// 2. 반지름이 5인 원의 면적을 구하되 정확한 결과를
// 얻기 위해 실수 형태로 결과를 출력하시오.

#include <iostream>
using namespace std;

int main()
{
	const double PI = 3.14;
	int r = 5;
	double area;

	area = r * r * PI;

	cout << "반지름이 "<<r<<"인 원의 면적은 " << area << " 입니다.\n";
}
