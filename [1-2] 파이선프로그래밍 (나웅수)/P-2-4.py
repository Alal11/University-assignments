# main 파일
import sub_P24                   # sub_P24 파일을 모듈로 불러옴

num = int(input("구하려는 숫자를 입력하세요 >> "))

print(sub_P24.fact(num))         # fact 함수로 num 팩토리얼을 계산해서 출력


# sub 파일 이름 => sub_24로 고치기
def fact(n):         # 입력받은 n을 매개변수로 하는 fact 함수

    factor = 1

    for i in range(n, 0, -1):       # i가 n부터
        factor *= i                 # n! 구하기

    return factor


if __name__ == "__main__":          # 단일로 실행할 경우
    print(fact(5))                  # 5!을 실행시켜 출력함
