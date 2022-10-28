#include <stdio.h>

struct product {                // 구조체 product 선언
    char item[10];
    int price;
};

// 사용자 정의 함수 chk에 product 구조체 포인터를 매개변수로 받음
int chk(struct product* p1, struct product* p2);            

int main(void)
{
    int result;
    struct product a = { "노트북", 20000};
    struct product b = { "스마트폰", 10000};

    printf("■ 구조체 포인터를 함수의 인수로 전달하는 프로그램\n");

    result = chk(&a, &b);                        // 구조체 멤버 변수가 가리키는 주소로 함수 호출

    if (result == 1)                             // result로 반환된 결과가 1이라면
        printf("\"%s\"과 \"%s\"은 동일한 품목입니다.\n",a.item, b.item);      // 동일한 품목 출력
    else
        printf("\"%s\"과 \"%s\"은 다른 품목입니다.\n", a.item, b.item);       // 0이라면 다른 품목 출력

    return 0;
}

int chk(struct product* p1, struct product* p2)              // 사용자 정의 함수 chk 정의
{
    if (strcmp(p1->item, p2->item) == 0 && p1->price == p2->price)      // p1의 item과 p2의 item이 같으면
        return 1;                               // 1을 반환하고
    else
        return 0;                               // 다르면 0을 반환한다.
}
