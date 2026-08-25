def revpattern(n):
    if n==1:
        return 
    print("*"*n)
    revpattern(n-1)

print(revpattern(6))