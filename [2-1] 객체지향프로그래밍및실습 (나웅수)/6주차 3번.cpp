// 3. 로그인 시에 비밀번호를 검사는 함수 check()를 작성하여 테스트하라.
// check()는 호출될때마다 비밀번호를 질문하고 일치 여부를 리턴한다.
// 만약 check()가 3번 이상 호출되고 비밀번호가 일치하지 않으면
// "로그인 시도 횟수 초과" 메시지를 출력한다.
//
// ex)
//>> 비밀번호: 123
//비밀번호가 다릅니다.다시한번 시도하세요
//>> 비밀번호 : 1234
//로그인 성공!
//
//>> 비밀번호 : 123
//비밀번호가 다릅니다.다시한번 시도하세요
//비밀번호 : 1235
//비밀번호가 다릅니다.다시한번 시도하세요
//비밀번호 : 2222
//로그인 시도횟수를 초과했습니다 프로그램을 종료합니다.

#include <iostream>
#define PASSWORD 1234		// =이랑 세미콜론 안쓰는거 주의!
using namespace std;

bool check(int password)
{
	static int cnt = 0;

	while (cnt <= 3)
	{
		cnt += 1;

		if (password == PASSWORD)
		{
			cout << "로그인 성공!\n";
			return true;
		}
		if (cnt == 3)
		{
			cout << "로그인 시도횟수를 초과했습니다 프로그램을 종료합니다.\n";
			exit(0);
		}
		else
		{
			cout << "비밀번호가 다릅니다. 다시 한번 시도하세요\n";
			return false;
		}
	}
}

void main()
{
	int password;
	bool isRight = false;

	while (!isRight)
	{
		cout << "비밀번호 : ";
		cin >> password;
		isRight = check(password);
	}
}
