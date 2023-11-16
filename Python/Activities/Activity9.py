listOne = [19, 26, 23, 11, 17,12]
listTwo = [13, 48, 54, 36, 12,76]

print("First List ", listOne)
print("Second List ", listTwo)

thirdList = []


for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)


for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)


print("result List is:")
print(thirdList)