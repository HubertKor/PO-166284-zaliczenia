from Client import Client
import sys


class Potential_buyer(Client):
    __discount_limit: float

    def __init__(self, name: str = "", adress: str = "", items_bought: dict = {}, bill: float = 0,
                 discount_limit: float = 100):
        super().__init__(name, adress, items_bought, bill)
        if discount_limit < 100:
            print("nieprawidłowa wartość")
            sys.exit(-10)
        else:
            self.__discount_limit = discount_limit

    @property
    def discount_limit(self):
        return self.__discount_limit

    @discount_limit.setter
    def discount_limit(self, discount_limit: float):
        if discount_limit != type(int):
            print("nieprawidłowa wartość")
        elif discount_limit < 100:
            print("nieprawidłowa wartość")
        else:
            self.__discount_limit = discount_limit

    def is_potential_buyer(self) -> bool:
        if self.discount() > self.__discount_limit:
            return True
        else:
            return False

