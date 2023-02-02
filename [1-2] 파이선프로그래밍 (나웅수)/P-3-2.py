class Calculator:
    def __init__(self, *cal):
        self.cal = cal

    def sum(self):
        cal_sum = 0
        for i in self.cal:
            cal_sum += i
        return cal_sum

    def avg(self):
        return self.sum()/len(self.cal)


cal_1 = Calculator(1, 2, 3, 4, 5)
print(cal_1.sum())
print(cal_1.avg())

cal_2 = Calculator(4, 5, 6)
print(cal_2.sum())
print(cal_2.avg())
