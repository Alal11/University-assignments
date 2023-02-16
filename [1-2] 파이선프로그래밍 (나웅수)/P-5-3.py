class InvalidNumberException():
    def __init__(self):
        print("InvalidNumberException을 발생시킵니다.")


def three_multi():
    num = int(input("3의 배수를 입력하세요 : "))

    if num % 3 == 0:
        print("{}은 3의 배수가 맞습니다!".format(num))
    else:
        print("{}는 3의 배수가 아닙니다".format(num), end='')
        InvalidNumberException()


three_multi()
