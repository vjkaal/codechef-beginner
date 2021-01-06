t=int(input())
for i in range(t):
    b=int(input())
    #print(int(b/2))
    c=(int(b/2)-1)
    #print(c)
    res=0
    for j in range(c+1):
        res+=j
    
    print(res)
