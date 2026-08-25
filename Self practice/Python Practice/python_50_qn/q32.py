#Take a key from the user and check whether
#  it exists in a dictionary.

d = {"ujjwal": [19,98],
      "A.K srivastav":[19,90],
      "Gaurav ": [19,95]}

str = input("write the value")

if str in d:
    print("your value present in the dictionary")
else:
    print("your value is not present in the dictionary")
