// 3. 대문자를 입력하면 소문자로 출력하고 나머지는
// 그대로 출력하는 프로그램을 구현하시오.
//
// ex)
// 입력: A
// 출력 : a
//
// 입력 : a
// 출력 : a

#include <iostream>
#include <string>
using namespace std;

int main()
{
	string str;

	cout << "입력: ";
	cin >> str;

	for (int i = 0; i < str.size(); i++)
	{
		if ('A' <= str[i] && str[i] <= 'Z')
		{
			str[i] += 32;
		}
	}
	cout << "출력: " << str<<endl;
}
