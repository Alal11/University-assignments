// 4. 4X4 행렬의 곱을 계산하는 프로그램을 작성하시오.
// 정수형 2차원 배열 matrixA[4][4] 및 matrixB[4][4]를 반복문을 통해
// 초기화하여 matrixC[4][4]에 곱셈 결과를 저장하여 출력한다.
//
// ex)
//※ MatrixC[i][j] = MatrixA[i][0] * MatrixB[0][j] + MatrixA[i][1] * MatrixB[1][j] + MatrixA[i][2] * MatrixB[2][j] + MatrixA[i][3] * MatrixB[3][j]
//
//>> Initializing MatrixA[0][0] = 1
//Initializing MatrixA[0][1] = 2
//....
//Initializing MatrixA[3][3] = 4
//
//Initializing MatrixB[0][0] = 2
//Initializing MatrixB[0][1] = 3
//....
//Initializing MatrixB[3][3] = 5
//
//MatrixC result :
//[2 3 4 5 6,
//11 .....
//.....
//.....
//..... 11]

#include <iostream>
using namespace std;

int main()
{
	int MatrixA[4][4];
	int MatrixB[4][4];
	int MatrixC[4][4] = { 0,0,0,0,
	0,0,0,0,
	0,0,0,0,
	0,0,0,0 };


	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			cout << "Initializing MatrixA[" << i << "][" << j << "] = ";
			cin >> MatrixA[i][j];;

		}
	}
	cout << "\n";

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			cout << "Initializing MatrixB[" << i << "][" << j << "] = ";
			cin >> MatrixB[i][j];
		}
	}

	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			for (int n = 0; n < 4; n++)
			{
				MatrixC[i][j] = MatrixA[i][n] * MatrixB[n][j];
			}
		}
	}

	cout << "MatrixC result : \n" << "[";
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			cout << " " << MatrixC[i][j];
		}
		cout << ",\n";
	}
	cout << "]";

}
