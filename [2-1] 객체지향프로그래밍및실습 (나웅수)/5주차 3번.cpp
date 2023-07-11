// 3. 거듭제곱을 구하는 프로그램을 구현한다.
// 입력받을 밑수와 지수를 입력받고 결과를 출력한다.
// 다만 오버플로우가 발생할 경우에 오류메시지를 출력해준다.
//
// ex)
//--> Enter a non-negative integer value for base : 2
//Enter a non - negative integer value for exponent : 2
//2 ^ 2 = 4
//
//Enter a non - negative integer value for base : 5
//Enter a non - negative integer value for exponent : 28
//Overflow occurred!Try again with smaller base or exponent.

#include <iostream>
using namespace std;

int main()
{
	int under_num, high_num;
	int result = 1;

	cout << "Enter a non-negative integer value for base : ";
	cin >> under_num;

	cout << "Enter a non-negative integer value for exponent : ";
	cin >> high_num;

	if (under_num < 0 || high_num < 0)
	{
		cout << "ERROR!\n";
	}
	else
	{
		for (int i = 0; i < high_num; i++)
		{
			result *= under_num;

			if (result < 0)
			{
				cout << "Overflow occurred! Try again with smaller base or exponent.\n";
				return 0;
			}
		}
		cout << under_num << "^" << high_num << " = " << result << "\n";
	}
}
