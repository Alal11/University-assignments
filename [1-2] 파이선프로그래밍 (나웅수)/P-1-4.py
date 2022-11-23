import random
print("입출력 예제)")

lucky_num = random.randrange(1, 101)                # 1부터 100사이의 숫자를 랜덤으로 하나 뽑기

while (1):
    print("숫자를 예측해보세요 (1~100) >> ")
    num = int(input())

    if num == lucky_num:                            # 입력한 num과 lucky_num이 일치하면 정답 출력
        print("정답입니다!!")
        break
    elif num > lucky_num:                           # num이 lucky_num보다 크면 숫자 높음 출력
        print("숫자가 높습니다.")
    else:                                           # num이 lucky_num보다 작으면 숫자 낮음 출력
        print("숫자가 낮습니다.")
