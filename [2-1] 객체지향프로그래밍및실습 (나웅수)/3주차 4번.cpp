// 4. 정수 3개를 입력받아서 합, 평균, 각 숫자의 차를 출력하시오.
//(평균 및 편차는 실수형태로, 편차는 음 / 양 부호를 포함하여 9칸에 출력하고 소수점은 2째 자리까지 출력하시오)
//
// ex)
//-- > Enter the first integer : 100
//Enter the seconds integer : 101
//Enter the third integer : 103
//
//Sum of three numbers : 304
//Average : 101.33
//Deviation of number 1 : -1.33
//Deviation of number 2 : -0.33
//Deviation of number 3 : +1.67

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	int a, b, c;

	cout << "Enter the first integer: ";
	cin >> a;
	cout << "Enter the seconds integer: ";
	cin >> b;
	cout << "Enter the third integer: ";
	cin >> c;

	cout << "\nSum of three numbers: " << a + b + c<<endl;
	
	cout << fixed << setprecision(2) << setw(9);
	double avg = (a + b +c) / 3.0;
	cout << "Average: " << avg << endl;

	cout << showpos;
	cout << "Deviation of number 1: " << a - avg<<endl;
	cout << "Deviation of number 2: " << b - avg<<endl;
	cout << "Deviation of number 3: " << c - avg<<endl;

}
