def id(x):
    s="";
    if(x=='B' or x=='b'): s="BattleShip"
    elif(x=='c' or x=='C'): s="Cruiser"
    elif(x=='D' or x=='d'): s="Destroyer"
    else: s="Frigate"
    return(s)


t=int(input())
for i in range(t):
    c=input()[0]
    print(id(c))
