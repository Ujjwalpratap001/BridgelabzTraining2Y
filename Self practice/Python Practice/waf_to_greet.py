#this is a function without argument

def greet():
    a=input("Your Good Name : ")
    print("hello! \nGood Morning",a,"!\n")

#greet()
#greet()

#this is a function along with the argument 

def greet2(name):
    print("hello! \nGood Morning",name,"!\n")

#greet2("Pratap")


#now using with the return value

def func3(a,b,c):
    d=a+b+c
    return d

e= func3(9,8,7)
print(e)