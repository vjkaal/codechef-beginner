t=int(input())
for i in range(t):
    a,b,c=map(int,input().split())
    print("YES") if((a+b+c)==180) else print("NO")
