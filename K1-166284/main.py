from vehicle import Vehicle
from car import Car

v_1 = Vehicle("xyz123", 1, 1950)
print(v_1)
print(v_1.model)
v_1.prod_year = 1990
print(v_1.prod_year)
v_2 = Vehicle("xyz12", 2, 1990)
print(v_2)

c_1 = Car("xyz",2,2011,2341,"zyz",2)
print(c_1)
c_2 = Car("xyz",2,2011,2341,"zyz",2)
print(c_2)
c_1.__eq__(c_2)
