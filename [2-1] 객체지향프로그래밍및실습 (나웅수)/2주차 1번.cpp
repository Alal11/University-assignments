// 1. 상품의 단가와 구입할 개수를 입력받아서
// 총 금액을 출력하는 프로그램을 구현하시오.
// 
// ex)
// 상품의 단가를 입력하시오 --> 800
// 구입할 개수를 입력하시오 --> 5
// 총 금액 : 4,000 원

#include <iostream>
using namespace std;

int main()
{
	int price, su, result;

	cout << "상품의 단가를 입력하시오 --> ";
	cin >> price;

	cout << "구입할 개수를 입력하시오 --> ";
	cin >> su;

	result = price * su;

	cout << "총 금액 : " << result << " 원\n";
}
