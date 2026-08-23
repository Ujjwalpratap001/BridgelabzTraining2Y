#a = int(input("write a number : "))
a=11

b= True

if a<2:
    print("not a prime number")

else:    

 for i in range (2,a):
    if a%i==0 :
        b=False
        

 if b==True:
    print("it is a prime number ")
 else:
    print("it is not a prime number ")