fruit_shop = {
    "apple": 17,
    "banana": 98,
    "orange": 65,
    "peaches": 12
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")