// 4. 정기 적금의 미래 가치를 출력하는 프로그램을 작성하시오
// 입력: 정기입금액, 이율, 년수
// 출력: 미래 가치액
//
// 미래가치액: 정기입금액 * 승수
// 승수: (1+이율)^n + (1+이율)^(n-1) + ... + (1+이율)^1
//
// ※ 다음과 같은 함수를 구현한다
//input() = > 입금액, 이율, 년수를 입력받는 함수
//process() = > 승수를 구해서 미래가치액을 구하는 함수
//output() = > 미래가치를 출력하는 함수
//findMultiplier() = > 승수를 구하는 함수
//
//ex) Enter the value of peridic investment : 12000
//Enter the interest rate per year : 5
//Enter the term(number of years) : 30
//
//Future value : 837129.48

#include <iostream>
#include <cmath>
#include <iomanip>
using namespace std;

void input(int&, int&, int&);
double process(int, int, int);
double findMultiplier(int, int);
void output(double);


void input(int& money, int& interest_rate, int& year)
{
	cout << "Enter the value of peridic investment: ";
	cin >> money;
	cout << "Enter the interest rate per year: ";
	cin >> interest_rate;
	cout << "Enter the term (number of years): ";
	cin >> year;
}

double findMultiplier(int interest_rate, int year)
{
	double multpl = 0.0;

	for (int i = 0; i <= year; i++)
	{
		multpl += pow(1.0 + (interest_rate / 100.0), double(i));

	}
	return multpl;
}

double process(int money, int interest_rate, int year)
{
	double multiplier;

	multiplier = findMultiplier(interest_rate, year);

	return money * multiplier;
}

void output(double future_value)
{
	cout << fixed << setprecision(2) << "\nFuture value: " << future_value << "\n";
}


int main()
{
	int money, interest_rate, year;
	double future_value;

	input(money, interest_rate, year);

	future_value = process(money, interest_rate, year);

	output(future_value);
}
