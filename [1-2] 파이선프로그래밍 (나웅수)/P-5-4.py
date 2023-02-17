f = open("C:\\Users\\finge\\...(생략)P-5-4-2.txt",
         "r", encoding="UTF8")

word = f.read()

print('"yesterday.txt" 파일 안에는 총 {}번의 yesterday가 있습니다.'.format(
    word.count("yesterday")))

f.close()
