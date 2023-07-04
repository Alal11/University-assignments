// 1. 3개의 성적을 입력받아서 최대, 최소, 최대 및 최소 값의 평균을 구해서 출력하는 프로그램을 작성하시오 (모든 값은 정수로 처리)
//
// ex)
//>> Enter the first score : 78
//Enter the second score : 92
//Enter the third score : 79
//Scores : 78 92 79
//Minimum and maximum scores : 78 92
//Average of min. and max.scores : 85

#include <iostream>
using namespace std;

int main()
{
	int a, b, c;
	cout << "Enter thr first score: ";
	cin >> a;
	cout << "Enter thr second score: ";
	cin >> b;
	cout << "Enter thr third score: ";
	cin >> c;

	cout << "Scores: " << a << " " << b << " " << c << "\n";

	int min, max, i;

	if (a < b)
	{
		min = a;
		max = b;

	}
	else if (a > b)
	{
		max = a;
		min = b;
	}
	if (max < c)
	{
		max = c;
	}
	if (min > c)
	{
		min = c;
	}

	cout << "Minimum and maximum scores: " << min << " " << max << "\n";
	cout << "Average of min. and max. scores: " << (min + max) / 2 << "\n";
}
