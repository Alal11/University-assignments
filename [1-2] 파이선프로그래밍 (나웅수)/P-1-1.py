count = 0                                         # 그룹 단어 개수를 세어주는 count 변수

num = int(input())

for i in range(0, num):
    word = input()                                # 위에서 입력 받은 수 만큼 반복하여 단어 입력
    test = True                                   # 각 단어마다 test의 초깃값을 True로 설정

    if (len(word) != 1 or len(word) != 2):        # 입력한 단어의 길이가 1 또는 2가 아닐 때
        for c in range(len(word)-1):              # 0부터 단어 길이 - 1까지 c 변수에 넣음
            if (word[c] != word[c+1]):            # 단어의 해당 문자와 다음 문자가 다를 때
                if (word[c] in word[c+1:]):       # 단어의 해당 문자가 뒤에 또 나온다면
                    test = False                  # test는 False가 됨
                    break

    if (test == True):                            # test가 그대로 True라면 count+1
        count += 1

print(count)
