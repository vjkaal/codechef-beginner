s="this"

def getS1(l):
    c=[0]*l
    for i in range(l):
        c[i]=s[i]
    c.sort();
    s1="".join(map(str,c));
    return(s1)


def getS2even(l):
    c=[0]*l
    for i in range(l):
        c[i]=s[l+i]
    c.sort();
    s1="".join(map(str,c));
    return(s1)


def getS2odd(l):
    c=[0]*l
    for i in range(l):
        c[i]=s[l+1+i]
    c.sort();
    s1="".join(map(str,c));
    return(s1)


def divide(x):
    if(x%2==0):
        s1=getS1(int(x/2))
        s2=getS2even(int(x/2))
        #strcmp here
        #print here
        print(s1,s2)
        #print(type(s1),type(s2))
        var="YES" if(s1==s2) else("NO")
        print(var)
        #print(compare_strings(s1,s2))
    else:
        s1=getS1(int(x/2))
        s2=getS2odd(int(x/2))
        #strcmp here
        print(s1,s2)
        var="YES" if(s1==s2) else("NO")
        print(var)
        #print(compare_strings(s1,s2))



t=int(input())
for i in range(t):
    s=input()
    l=len(s)
    if((l&1)!=1):
        divide(l)
    else: divide(l)

