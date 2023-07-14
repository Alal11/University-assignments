// 2. 주사위를 던져서 각각의 면이 몇 번 나왔는지 출력하는 프로그램을 작성하라.
// 주사위를 던지는 함수 get_dice_face()를 만들고 각각의 면이 나올때마다 횟수를 저장하고 출력한다.
//
// ex)
//>> 1-> 19
//2 -> 13
//3 -> 20
//4 -> 17
//5 -> 19
//6 -> 12

#include <iostream>
using namespace std;

void get_dice_face(int cnt)
{
	int dice;
	int arr[7] = { 0 };

	cout << "주사위를 " << cnt << "번 굴립니다 데구르르..\n";

	srand((unsigned int)time(NULL));

	for (int i = 0; i < cnt; i++)
	{
		dice = rand() % 6 + 1;

		arr[dice] += 1;
	}

	for (int i = 1; i <= 6; i++)
	{
		cout << i << " -> " << arr[i] << "\n";
	}
}

int main()
{
	int num;

	cout << "반복할 횟수를 입력하세요 : ";
	cin >> num;

	get_dice_face(num);
}
