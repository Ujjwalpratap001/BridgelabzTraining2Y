#reverse a list

l=[5,6,99,3,2]

n=int(len(l)/2)

for i in range(0,n):
    temp=l[i]
    l[i]=l[len(l)-i-1]
    l[len(l)-i-1]=temp

print(l)