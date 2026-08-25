l1=[3,4,5,6,7,4,4,44,3,33,2,2,]

#for i in set(l1):
 #   print(f"{i} appears {l1.count(i)} times")

for i in range(len(l1)):
    count=0
    for j in range(len(l1)):
        if l1[i]==l1[j]:
            count+=1
    print(l1[i],"appears",count,"times")
 
  