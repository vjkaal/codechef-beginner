def maxPower(a):
    res=0
    for i in range(12):
        print(i,end=' ')
        b=pow(2,i)
        print(b,' ')
        if(b>a):
            res=i-1
            break;
        if(a>1024):
            res=11
            break
    print()
    return(res)


def minMenus(a,b):
    res=0
    val=0
    while(b>=0):
        c=pow(2,b)
        while(val!=a):
            if((val+c)<=a):
                val+=c
                res+=1
                print(val,end=' ')
                print(c)
            else:
                break;
        b-=1
    return(res)


t=int(input())
for i in range(t):
    p=int(input())
    q=maxPower(p)
    r=minMenus(p,q)
    print(r)
