class Human:
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender

    def setInfo(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender

    def printInfo(self):
        print("{}, {}, {}".format(self.name, self.age, self.gender))


print("# 폴더와 파일 구분하기")

Kim = Human("김하성", 27, "남자")
jang = Human("장원영", 18, "여자")
unknown = Human("모름", 0, "모름")
unknown.setInfo("산타할아버지", 100, "남자")

Kim.printInfo()
jang.printInfo()
unknown.printInfo()
