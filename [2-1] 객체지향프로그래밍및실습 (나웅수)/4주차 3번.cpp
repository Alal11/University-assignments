//3. 소득 범위에 따른 세금 출력 프로그램을 작성하시오.
// 세율은 다음과 같은 계산식을 따른다.
//  0 < 소득 < 10,000 --> 세금: 소득 * 0.05
//	10,000 < 소득 < 50,000 --> 세금 : 10,000 * 0.05 + (소득 - 10,000) * 0.1
//	50,000 < 소득 < 100,000 --> 세금 : 10,000 * 0.05 + (50,000 - 10,000) * 0.1 + (소득 - 50,000) * 0.15
//	100,000 < 소득-- > 세금 : 10,000 * 0.05 + (50,000 - 10,000) * 0.1 + (100,000 - 50,000) * 0.15 + (소득 - 100,000) * 0.2
//
// ex)
//	>> Enter income in dollars : 8500
//	Income : 8500
//	Tax due : 425

#include <iostream>
using namespace std;

int main()
{
	int income, tax;

	cout << "Enter income in dollars: ";
	cin >> income;

	cout << "Income : "<<income << "\n";

	if (0 < income && income < 10000)
	{
		tax = income * 0.05;
	}
	else if (10000 < income&& income < 50000)
	{
		tax = 500 + (income - 10000) * 0.1;
	}
	else if (50000 < income && income < 100000)
	{
		tax = 4500 + (income - 50000) * 0.15;
	}
	else if (100000 < income)
	{
		tax = 12000 + (income - 100000) * 0.2;
	}

	cout << "Tax due: " << tax << "\n";

}
