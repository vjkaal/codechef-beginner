def gcdF(x,y):
    if(x==0): return(y)
    return(gcdF(y%x,x))


t=int(input())
for i in range(t):
    a,b=map(int,input().split())
    c=a if(a<b) else b
    d=a if(a>b) else b
    g,l=0,0
    g=gcdF(c,d)
    l=int((a*b)/g)
    print(g,end=' ')
    print(l)
