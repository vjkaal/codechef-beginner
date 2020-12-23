def reverse(x):
    b=0
    while(x>0):
        temp=int(x%10)
        b=int(b*10+temp)
        print(b,temp,x)
        x=int(x/10)
    print(b)
    return(b)


t=int(input())
for i in range(t):
    n=int(input())
    m=int(reverse(n))
    print(("loses","wins") [m==n])
