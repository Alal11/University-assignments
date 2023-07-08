// 5. 가위 바위 보 게임을 구현한다. 
// 가위 (1), 바위 (2), 보 (3) 중에 정수 한개를 입력하고 
// 컴퓨터는 이 중 하나를 랜덤하게 결정짓는다. 
// 승부에 따른 결과를 출력한다.
//
// ex)
//>> 가위(1), 바위(2), 보(3) 중에 하나를 입력하세요 : 1
//당신은 가위(1) 입니다.
//컴퓨터는 바위(2) 입니다.
//당신은 졌습니다!
//
//>> 가위(1), 바위(2), 보(3) 중에 하나를 입력하세요 : 1
//당신은 가위(1) 입니다.
//컴퓨터는 가위(1) 입니다.
//비겼습니다!

#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
	int num, ran;

	cout << "가위 (1), 바위(2), 보(3) 중에 하나를 입력하세요: ";
	cin >> num;

	if (num == 1)
	{
		cout << "당신은 가위 (1) 입니다.\n";
	}
	else if (num == 2)
	{
		cout << "당신은 바위 (2) 입니다.\n";
	}
	else if (num == 3)
	{
		cout << "당신은 보 (3) 입니다.\n";
	}
	else
	{
		cout << "에러!\n";
		return 0;
	}

	srand((unsigned int) time(NULL));
	ran = rand() % 3 + 1;
	
	if (ran == 1)
	{
		cout << "컴퓨터는 가위 (1) 입니다.\n";
	}
	else if (ran == 2)
	{
		cout << "컴퓨터는 바위 (2) 입니다.\n";
	}
	else
	{
		cout << "컴퓨터는 보 (3) 입니다.\n";
	}
	
	if (num == ran)
	{
		cout << "비겼습니다!\n";
		return 0;
	}
	else if (num == 1)
	{
		if (ran == 2)
			cout << "당신은 졌습니다!\n";
		else
			cout << "당신은 이겼습니다!\n";
	}
	else if (num == 2)
	{
		if (ran == 1)
			cout << "당신은 이겼습니다!\n";
		else
			cout << "당신은 졌습니다!\n";
	}
	else
	{
		if (ran == 1)
			cout << "당신은 졌습니다\n";
		else
			cout << "당신은 이겼습니다!\n";
	}

}
