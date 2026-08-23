#write a program to calculate the factorial of a given number using for loop 

#  5! =  1x2x3x4x5
#  10! =  1x2x3x4x5x6x7x8x9x10
n=int(input("enter the value : "))

i=1
mult=1
while i<n+1:
    mult =mult *i
    i+=1

print("the factorial is : ",mult)