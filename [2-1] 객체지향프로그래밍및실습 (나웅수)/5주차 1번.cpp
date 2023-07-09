// 1. 입력받은 숫자의 합과 곱을 구하는 프로그램을 작성한다.
// 입력으로 몇개의 숫자를 입력받을지와 각각의 숫자를 입력 받음.
// 출력으로 입력한 숫자의 합과 곱을 출력해준다.
//
// ex)
//--> Enter a non-negative integer value for size : 6
//Enter the next number : 12.45
//Enter the next number : 2.2
//......
//......
//
//sum = 87.89
//product = 849130.12


#include <iostream>
using namespace std;

int main()
{
	int size;
	double sum = 0.0, product = 1.0;

	cout << "Enter a non-negative integer value for size : ";
	cin >> size;

	if (size <= 0)
	{
		cout << "ERROR!\n";
	}
	else
	{
		for (int i = 0; i < size; i++)
		{
			float num;
			cout << "Enter thr next number : ";
			cin >> num;

			sum += num;
			product *= num;
		}
		cout << "\nsum = " << sum << "\n";
		cout << "product = " << product << "\n";
	}
}
