def prime(x):
    d=0
    s="no"
    if(x==1): s="no"
    elif(x==2): s="yes"
    elif(x%2==0): s="no"
    else:
        for i in range(2,x):
            if(x%i==0): d+=1
            else: d+=0
        if(d>=1): s="no"
        else: s="yes"
    return(s)


t=int(input())
for i in range(t):
    n=int(input())
    print(prime(n))
