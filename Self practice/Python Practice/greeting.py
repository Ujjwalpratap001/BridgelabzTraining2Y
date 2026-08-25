l = ["Harry","soham","sachin","rahul"]
'''
print(f"{l[0]} , Good Morning \n What's going on \n")
print(f"{l[1]} , Good Morning \n What's going on \n")
print(f"{l[2]} , Good Morning \n What's going on \n")
print(f"{l[3]} , Good Morning \n What's going on \n")    '''


for item in l:
    if item.startswith("s"):
        print("Good Morining",item)