n=5

for i in range (1,n+1):
    print("❄️"*i)
print("")


for i in range(1,n+1):
    print("*"*(2*i-1))
print("")



for i in range(n):
    if i==0 or i==n-1:
        print("*"*(n))
    else:
        print("*"+" "*(n-2)+"*")