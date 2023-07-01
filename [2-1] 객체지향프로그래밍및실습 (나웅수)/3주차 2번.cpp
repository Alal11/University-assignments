// 2. 정수가 주어졌을 때, 첫 번째 자리수를 추출하시오.
// 
// ex) 6759를 입력하면 9를 출력
//-- > Enter a positive integer : 253
//Entered integer : 253
//Extracted first digit : 3

#include <iostream>
using namespace std;

int main()
{
	unsigned int num;

	cout << "Entered integer: ";
	cin >> num;

	cout << "Extracted first digit: " << num % 10;
}
