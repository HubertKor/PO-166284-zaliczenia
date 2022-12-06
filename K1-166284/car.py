from vehicle import Vehicle


class Car(Vehicle):
    __price: float
    __colour: str
    __extra_seats: int

    def __init__(self, reg: str = None, model: int = 0, prod_year: int = 2022, price: float = 0, colour: str = None,
                 extra_seats: int = 0):
        super().__init__(reg, model, prod_year)
        if price < 0:
            self.__price = 0
        else:
            self.__price = price
        if extra_seats < 0:
            self.__extra_seats = 0
        else:
            self.__extra_seats = extra_seats
        self.__colour = colour

    @property
    def price(self):
        return self.__price

    @price.setter
    def price(self, value):
        if self.price < 0:
            print("error value")
            return
        else:
            self.__price = value

    @property
    def colour(self):
        return self.__colour

    @colour.setter
    def colour(self, value):
        self.colour = value

    @property
    def extra_seats(self):
        return self.__extra_seats

    @extra_seats.setter
    def extra_seats(self, value):
        if self.extra_seats < 0:
            print("error value")
            return
        else:
            self.__extra_seats = value

    def drive(self):
        return f'Jade świetnym pojazdem z roku{super().drive()}! Ma kolor {self.colour}'

    def __eq__(self, other):
        if self.model == other.model:
            return True
        return self.price == other.price

    def __ne__(self, other):
        return not self == other

    def __str__(self):
        if self.model is None:
            return f"""Pojazd wyprodukowany w roku{self.prod_year}\n Rejestracja: {self.reg}\n Cena: {self.__price}' \
                   f'Kolor: {self.__colour}\n Dodatkowe siedzenia: {self.__extra_seats}"""
        elif self.__price is None:
            return f"""Pojazd wyprodukowany w roku{self.prod_year}\n Model: {self.__model}\n Rejestracja: {self.reg}\n'\
                   f'Kolor: {self.__colour}\n Dodatkowe siedzenia: {self.__extra_seats}"""
        elif self.__colour is None:
            return f"""Pojazd wyprodukowany w roku{self.prod_year}\n Model: {self.__model}\n Rejestracja: {self.reg}\n 
            Cena: {self.__price}' \
                   f'Dodatkowe siedzenia: {self.__extra_seats}"""
        else:
            return f"""Pojazd wyprodukowany w roku {self.prod_year}\n Model:{self.model}\n Rejestracja: {self.reg}\n 
            Cena: {self.__price}' \
                   f'Kolor: {self.__colour}\n Dodatkowe siedzenia: {self.__extra_seats}"""
