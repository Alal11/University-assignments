class Calculator:
    def __init__(self):
        self.value = 0

    def add(self, val):
        self.value += val


class MaxLimitCalculator(Calculator):
    def add(self, val):
        super().add(val)        # 기반 클래스의 메서드 호출하여 중복을 줄임
        if self.value > 100:
            print("객체의 값이 100이 넘어갑니다! 동작이 취소됩니다.")
            self.value -= val


cal = MaxLimitCalculator()
cal.add(50)
cal.add(60)
print(cal.value)
