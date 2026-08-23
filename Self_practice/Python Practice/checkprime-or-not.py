a= int(input("write a number : "))

if a<2:
    print("not a prime number ")

else:
    for i in range(2,a):
     if a%i==0:
        print("not a prime number ")
        break
    else:
         print("it is a prime number")
