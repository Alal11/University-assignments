num = int(input())

if not (2 <= num <= 9):                     # 입력한 num이 2~9가 아니라면
    print("오류 메세지")                     # 오류 메세지 출력

else:
    for i in range(1, 10):                  # num이 2~9라면 i는 1부터 9까지 반복
        print(num, "*", i, "=", num*i)      # 출력 형식에 맞춰서 출력
