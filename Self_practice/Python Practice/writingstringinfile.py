pratap=open("pratap2","w")



for i in range(1,6):
    text=input(f"enter the string {i} : ")
    pratap.write(text +"\n")

    i+=1
pratap.close