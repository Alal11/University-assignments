class Grade:
    def __init__(self, name, kor, eng, math):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.math = math

    def score(self, course):
        if course == "kor":
            print("{}의 국어 점수는 {}점 입니다".format(self.name, self.kor))
        elif course == "eng":
            print("{}의 영어 점수는 {}점 입니다".format(self.name, self.eng))
        elif course == "math":
            print("{}의 수학 점수는 {}점 입니다".format(self.name, self.math))

    def average(self):
        hap = self.kor+self.eng+self.math
        print("{}의 평균 점수는 {}점 입니다".format(self.name, hap/3))

    def delete(self):
        print("{} 학생 객체는 삭제되었습니다.".format(self.name))


p1 = Grade("Kim", 60, 80, 65)
p2 = Grade("Park", 80, 49, 93)

p1.score('kor')
p2.score('eng')
p2.average()
p2.delete()
