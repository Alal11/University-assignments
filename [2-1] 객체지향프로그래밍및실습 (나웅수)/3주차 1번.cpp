// 1. 부동 소수점을 정수 부분과 소수점 아래 부분으로 분리한다.
// 
// ex) 123.78을 입력하면 123과 0.78을 출력
//-> Enther the floating - point number : 145.72
//The original number : 145.72
//The integral part : 145
//The fractional part : 0.72

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	float num;

	cout << "The original number: ";
	cin >> num;
	
	int num_i = num;
	cout << "The integral part: " << num_i<<endl;

	float num_f = num - num_i;
	cout << setprecision(2);
	cout << "The fractional part: " << num_f<<endl;
}
