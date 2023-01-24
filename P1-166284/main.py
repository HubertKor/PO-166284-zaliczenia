from potential_buyer import Potential_buyer
from Client import Client

k_1 = Client("Hubert Korowaj", "Dobre Miasto", {"sol":4,"pieprz":2,"cs":1}, 123)
print(k_1)
print(k_1.discount())
k_2 = Client("Hubert Korowaj","Inyy",{"sol":4,"pieprz":2,"cs":1},123)
print(k_1.__eq__(k_2))
kr_1 = Potential_buyer("Hubert Korowaj", "Dobre Miasto", {"sol":4,"pieprz":2,"cs":1}, 123)
print(kr_1.is_potential_buyer())
k_3 = Client("Hubert Korowaj", "Dobre Miasto", {"sol":4,"pieprz":2,"cs":1}, 0)
print(k_3)


