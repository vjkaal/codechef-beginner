t=(int(input()))
while(t>0):
    t-=1
    a,b=map(int,input().split())
    min=a if(a>b) else b
    max=a+b
    print(min,max)
