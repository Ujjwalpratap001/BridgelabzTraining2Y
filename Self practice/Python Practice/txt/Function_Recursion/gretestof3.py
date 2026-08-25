#WAP to find the gretest of three number 

def gretest(a=0,b=0,c=0):
    if(a>b and a>c):
        d=(a,"a is greater")
        
    elif(b>a and b>c):
        d=(b,"b is greater")
    elif(c>a and c>b):
        d=(c,"c is greater")

    return d

big= gretest(7,8,9)
print(big)
