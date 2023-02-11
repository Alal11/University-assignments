class Car:
    def __init__(self, model, color, quantity):
        self.model = model
        self.color = color
        self.quantity = quantity

    def displayCar(self):
        print("모델명: {}, 색상: {}, 배기량: {}cc".format(
            self.model, self.color, self.quantity))


class ElectricCar(Car):
    def __init__(self, model, color, battery):
        super().__init__(model, color, battery)

    def displayCar(self):
        print("모델명: {}, 색상: {}, 배터리 타입: {}".format(
            self.model, self.color, self.quantity))


car = Car('Samsung SM5', 'black', 2000)
car.displayCar()

elec_car = ElectricCar('Tesla Model 3', 'black', 'Lithium')
elec_car.displayCar()
