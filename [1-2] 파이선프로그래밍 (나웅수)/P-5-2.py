while (1):
    f = open("C:\\Users\\finge\\(생략 주소)\P-5-2-2.txt",
             'r', encoding="UTF8")
    line_num = 1

    num = int(input("출력할 라인 수는? : "))

    try:
        if not 1 <= num <= 10:
            print("입력 라인 수는 1~10까지 입니다.")
        else:
            while line_num <= num:
                line = f.readline()
                print(line, end="")
                line_num += 1
    except:
        print("입력은 정수로만 해주세요.")

    f.close()
