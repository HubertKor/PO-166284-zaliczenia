class Vehicle:
    __reg: str
    __model: int
    __prod_year: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022):
        if model < 0:
            self.__model = 0
        else:
            self.__model = model
        if prod_year < 1900 or prod_year > 2022:
            self.__prod_year = 2022
        else:
            self.__prod_year = prod_year
        self.__reg = reg

    @property
    def reg(self):
        return self.__reg

    @property
    def model(self):
        return self.__model

    @property
    def prod_year(self):
        return self.__prod_year

    @reg.setter
    def reg(self, value):
        self.__reg = value

    @model.setter
    def model(self, value):
        if self.model < 0:
            print("error value")
            return
        else:
            self.__model = value

    @prod_year.setter
    def prod_year(self, value):
        if not 2022 <= value <= 1900:
            print("error value")
            return
        else:
            self.__prod_year = value

    def brake(self):
        return print(f'Zatrzymuje się')

    def drive(self):
        return print(f'Jadę świetyn pojazdem z roku {self.__prod_year}!')

    def __repr__(self):
        if self.__reg is None:
            return print(f'Pojazd wyprodukowany w roku: {self.__prod_year}\n Model: {self.__model}')
        elif self.__prod_year is None:
            return print(f' Model: {self.__model}\n Rejestracja: {self.__reg}')
        elif self.__model is None:
            return print(f'Pojazd wyprodukowany w roku: {self.__prod_year}\n Rejestracja: {self.__reg}')
        else:
            return f'Pojazd wyprodukowany w roku: {self.__prod_year}\n Model: {self.__model}\n Rejestracja {self.__reg}'

    def __eq__(self, other):
        if self.model == other.model:
            if self.prod_year == other.prod_year:
                return True

    def __ne__(self, other):
        return not self == other
