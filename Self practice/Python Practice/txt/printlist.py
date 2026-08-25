l=[34,54,55,3,2,"pratap","singh",False,True]

c=0
print("this is using while loop ")
while c<len(l):
    print(l[c] , end=" ")
    c=c+1


#now printing using for loop 
print("")
print("this is using for loop ---")
for item in l:
    
    print( item, end=" ,")



#using for loop syntax

for c in range (len(l)):
    print(l[c])