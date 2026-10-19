import pandas as pd

data = {
        "names" : ["Yogeshh", "Samruddhi", "Rohit", "Priya"],
        "city" : ["Mumbai", "Delhi", "Bangalore", "Chennai"],
        "marks" : [10,20,30,40]
}
df = pd.DataFrame(data = data)
# print(df)
# print(df["marks"])
# print(df["marks"].sum())
# print(df["city"].info())
# print(df["city"].describe())
# print(df["marks"].median())
# dir = df["marks"]>25
# print(df[dir])

# d = df["marks"] + 10
# print(df[d])

# df["marks"] = df["marks"] + 5
# print(df)

print(df.sort_values(by = "marks", ascending = True))