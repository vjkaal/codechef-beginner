t=int(input())
for i in range(t):
    q,p=map(int,input().split())
    if(q<1000):
        r=q*p
        print('%.6f'%r)
    else:
        r=q*p-(q*p/10)
        print('%.6f'%r)
