file = open("kalumadari.txt")
content = file.read()
if("madari" in content):
    print("word is present in the flie")
else:
    print("the word is not present in the file")

file.close 