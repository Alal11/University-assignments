// 2. 성적에 따른 합격/불합격 출력 프로그램을 작성하시오. 
// 4학년의 경우에는 70점 이상이 합격, 그 외 학년은 60점 이상일 경우에만 
// 합격 문구를 출력해준다. (학년은 1~4, 점수는 0~100의 값만 입력 가능하며
// 그 외의 숫자를 입력시에는 오류 메세지를 출력한다)
// 
// ex)
//>> 학년을 입력하세요 : 4
//점수를 입력하세요 : 75
//합격입니다!
//
//>> 학년을 입력하세요 : 5
//잘못된 입력입니다!

#include <iostream>
using namespace std;

int main()
{
	int grade, score;

	cout << "학년을 입력하세요: ";
	cin >> grade;

	if (grade < 0 || grade > 4)
	{
		cout << "잘못된 입력입니다!\n";
		return 0;
	}

	cout << "점수를 입력하세요: ";
	cin >> score;

	if (score >= 0 && score <= 100)
	{
		if (grade == 4)
		{
			if (score >= 70)
				cout << "합격입니다!\n";
			else
				cout << "불합격입니다..\n";
		}
		else
		{
			if (score >= 60)
				cout << "합격입니다!\n";
			else
				cout << "불합격입니다..\n";
		}
	}
	else
		cout << "잘못된 입력입니다!\n";
}
