import sys
from typing import Dict


class Client:
    __name: str
    __adress: str
    __items_bought: dict[str, int]
    __bill: float

    def __init__(self, name: str = " ", adress: str = " ", items_bought: dict = {}, bill: float = 0):
        self.__name = name
        self.__adress = adress

        if bill < 0:
            self.__bill = 0
        else:
            self.__bill = bill
        if len(items_bought) < 0:
            print("niprawidłowa wartosc")
            sys.exit(-10)
        else:
            self.__items_bought = items_bought
            if len(items_bought) > 0 and bill <= 0:
                print("nieprawidłowa wartosć")
                sys.exit(-20)

    @property
    def name(self):
        return self.__name

    @property
    def adress(self):
        return self.__adress

    @property
    def items_bought(self):
        return self.__items_bought

    @property
    def bill(self):
        return self.__bill

    @name.setter
    def name(self, name: str):
        if name != type(str):
            print("nieprawidłowa wartość")
        self.__name = name

    @adress.setter
    def adress(self, adress: str):
        if adress != type(str):
            print("nieprawidłowa wartość")
        self.__name = adress

    @items_bought.setter
    def items_bought(self, items_bought: dict[str, int]):
        if len(items_bought) < 0:
            print("zly")
            sys.exit(-10)
        else:
            self.__items_bought = items_bought

    @bill.setter
    def bill(self, bill: float):
        if bill < 0:
            print("zly")
        else:
            self.__bill = bill

    def discount(self):
        for item in self.__items_bought:
            if self.__items_bought[item] > 3:
                return (self.__bill * 1.2) / 100
            elif self.__bill > 200:
                return (self.__bill * 3.7) / 100
            else:
                return 'Brak rabatu'

    def __str__(self):
        if len(self.__items_bought) > 0:
            return f'Nazwa klienta: {self.__name}\n Adres:{self.__adress} \n kupione przedmioty: {self.__items_bought}\n ' \
                   f'Rachunek: {self.__bill} zł '
        else:
            return f'Nazwa klienta: {self.__name}\n Adres:{self.__adress}'

    def __eq__(self, other) -> bool:
        if self.__name == other.__name and self.__adress == other.__adress:
            return True
        else:
            return False
