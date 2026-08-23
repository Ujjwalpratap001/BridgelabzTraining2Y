#write a recursive function to print first n natural number 

def firstn(n):
    if n==0:
        return 0
    return n + firstn(n-1)

print(firstn(10))