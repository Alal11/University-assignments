// 1. 직사각형과 원의 면적을 계산하는 GetArea() 함수를 작성한다.
// 직사각형의 경우에는 가로길이, 세로길이를 입력받고 원은 반지름을 입력받는다.
//
// ex)
//>> 구하고 싶은 넓이의 도형을 선택하세요
//1. 직사각형
//2. 원
//>> 1
//직사각형의 가로, 세로길이를 입력하세요 >> 3, 4
//직사각형의 넓이는 >> 12
//
//>> 구하고 싶은 넓이의 도형을 선택하세요
//1. 직사각형
//2. 원
//>> 2
//원의 반지름을 입력하세요 >> 5
//원의 넓이는 >> 78.5

#include <iostream>
#define PI 3.14;

using namespace std;

double GetArea(int, int);
double GetArea(int);


int main()
{
	cout << "구하고 싶은 넓이의 도형을 선택하세요\n";
	cout << "1. 직사각형\n2. 원\n>> ";
	int num;
	cin >> num;

	if (num == 1)
	{
		int w, h;
		cout << "직사각형의 가로, 세로길이를 입력하세요 >>";
		cin >> w >> h;

		cout << "직사각형의 넓이는 >> " << GetArea(w, h) << "\n";
	}
	else if (num == 2)
	{
		int r;
		cout << "원의 반지름을 입력하세요 >> ";
		cin >> r;

		cout << "원의 넓이는 >> " << GetArea(r) << "\n";
	}

}

double GetArea(int width, int height)
{
	return width * height;
}

double GetArea(int radius)
{
	return radius * radius * PI;
}
