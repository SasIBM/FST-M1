import pandas

data = {
    "Usernames": ["admin", "Charles", "Peku"],
    "Passwords": ["password", "password1", "password2"]
}

dataframe = pandas.DataFrame(data)

print(dataframe)

dataframe.to_csv("sample.csv", index=False)