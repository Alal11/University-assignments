// 4. int, short, long 자료형의 bit 수를 출력하고 표현할 수 있는
// 최대, 최소값을 출력하는 프로그램을 구현하시오.
//
// ex)
//(참고: https://learn.microsoft.com/ko-kr/cpp/c-language/cpp-integer-limits?view=msvc-170)
//
//Integer size : 32bits
//MAX value : 2147483647
//MIN value : -2147483648
//==================================== =
//Short size : 16bits
//MAX value : 32767
//MIN value : -32768
//==================================== =
//Long size : 32bits
//MAX value : 2147483647
//MIN value : -2147483648
//==================================== =

#include <iostream>
#include <limits>
using namespace std;

int main()
{
	cout << "Integer size : "<<sizeof(int)*8<<"bits"<<endl;
	cout << "MAX value : "<<INT_MAX << endl;
	cout << "MIN value : "<<INT_MIN << endl;
	cout << "=====================================\n";

	cout << "Short size : "<<sizeof(short) * 8 <<"bits"<< endl;
	cout << "MAX value : " << SHRT_MAX << endl;
	cout << "MIN value : " << SHRT_MIN << endl;
	cout << "=====================================\n";

	cout << "Long size : " << sizeof(long) * 8 << "bits"<<endl;
	cout << "MAX value : " << LONG_MAX << endl;
	cout << "MIN value : " << LONG_MIN << endl;
	cout << "=====================================\n";
}
