class Circle:
    PI = 3.14
    radius = 0

    def __init__(self, gab):
        self.radius = gab

    def calcPerimeter(self):
        print("원의 둘레: {:.1f}".format(2*self.radius*self.PI))

    def calcArea(self):
        print("원의 면적: {:.1f}".format(self.radius**2*self.PI))


x = Circle(5)
x.calcPerimeter()
x.calcArea()
