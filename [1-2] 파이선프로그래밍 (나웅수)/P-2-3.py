import random                       # random 모듈 사용

lucky_list = []                     # lucky_list 생성

for i in range(6):
    lucky_num = random.randrange(1, 46)         # 1부터 45까지의 랜덤 숫자 생성

    while lucky_num in lucky_list:              # lucky_list에 lucky_num이 있으면
        lucky_num = random.randrange(1, 46)     # 다시 랜덤 숫자를 뽑아서 중복 확인함

    # 중복이 아닌 lucky_num을 lucky_list에 넣음
    lucky_list.append(lucky_num)

lucky_list.sort()                   # lucky_list 값을 오름차순으로 정렬
print(lucky_list)                   # lucky_list 출력
 
