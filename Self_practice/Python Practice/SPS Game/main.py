# This is Stone Paper Scissor Game

import random

#  1  = Stone
#  0  = Paper
# -1 = Scissor

computer = random.choice([1,0,-1])
youstr = input("Choose Stone , Paper , Scissor\n  ---> ").lower()
youdict = {"stone": 1 , "paper": 0, "scissor":-1}
revdict = {1 : "stone", 0: "paper",-1 : "scissor"}

you=youdict[youstr]

print("     You Choose :",youstr)
print("Computer Choose :",revdict[computer])

if (you==computer):
    print("its a draw ")
else:
    if(you==1 and computer ==0):
        print("You Lose ")
    
    elif(you==1 and computer==-1):
        print("You Win ")
    elif(you==0 and computer==1):
        print("You Win ")
    elif(you==0 and computer==-1):
        print("You Loose")
    elif(you==-1 and computer==1):
        print("You Loose")
    elif(you==-1 and computer==0):
        print("You Win")

    else :
        print("Invalid !")


    


