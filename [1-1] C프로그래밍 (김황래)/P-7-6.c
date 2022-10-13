#include <stdio.h>

int main(void)
{
	int yy, mm, dd;

	scanf_s("%d %d %d", &yy, &mm, &dd);

	switch (mm) {
	case 12:
		dd += 31;
	case 11: 
		dd += 31;
	case 10:
		dd = 30 + dd;
	case 9:
		dd = 31 + dd;
	case 8:
		dd = 31 + dd;
	case 7:
		dd = 30 + dd;
	case 6:
		dd = 31 + dd;
	case 5:
		dd = 30 + dd;
	case 4:
		dd = 31 + dd;
	case 3:
		dd = 28 + dd;
	case 2:
		dd = 31 + dd;
	case 1:
		printf("%d", dd);
	}
	return 0;
}


// 비효율적인 코드
	/*case 1:
		dd = dd;
		printf("%d", dd);
		break;
	case 2:
		dd = 31 + dd;
		printf("%d", dd);
		break;
	case 3:
		dd = 31 + 28 + dd;
		printf("%d", dd);
		break;
	case 4:
		dd = 31 + 28 + 31 + dd;
		printf("%d", dd);
		break;
	case 5:
		dd = 31 + 28 + 31 + 30 + dd;
		printf("%d", dd);
		break;
	case 6:
		dd = 31 + 28 + 31 + 30 + 31 + dd;
		printf("%d", dd);
		break;
	case 7:
		dd = 31 + 28 + 31 + 30 + 31 + 30 + dd;
		printf("%d", dd);
		break;
	case 8:
		dd = 31 + 28 + 31 + 30 + 31 + 30 + 31 + dd;
		printf("%d", dd);
		break;
	case 9:
		dd = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + dd;
		printf("%d", dd);
		break;
	case 10:
		dd = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + dd;
		printf("%d", dd);
		break;
	case 11:
		dd = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + dd;
		printf("%d", dd);
		break;
	case 12:
		dd = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + dd;
		printf("%d", dd);
		break;
	}*/
