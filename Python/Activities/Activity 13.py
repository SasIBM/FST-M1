def sum1(numbers):
    total = 0
    for i in numbers:
        total = total + i
    return total


numList = [10, 62, 61, 91]

result = sum1(numList)

print("The sum of all the elements is: " + str(result))
