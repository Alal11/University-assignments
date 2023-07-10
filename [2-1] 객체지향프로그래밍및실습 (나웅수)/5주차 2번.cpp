// 2. Factorial (팩토리얼)을 구하는 프로그램을 구현한다.
// 계산할 팩토리얼 숫자 n을 입력받고 n!을 출력한다.
// 만약 n을 입력할 경우 에러 메세지를 출력하고 다시 입력받는다.
//
// ex)
//--> Enter the factorial size : 4
//4!= 24

#include <iostream>
using namespace std;

int main()
{
	int num;
	unsigned int fact = 1;

	while (1)
	{
		cout << "Enter thr factorial size : ";
		cin >> num;

		if (num <= 0)
		{
			cout << "ERROR!\n\n";
		}
		else
			break;
	}

	for (int i = num; i > 1; i--)
	{
		fact *= i;
	}
	cout << num << "! = " << fact << "\n";
}
