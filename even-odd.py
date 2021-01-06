s=input()
i=len(s)
s1="even" if((i^1)==i+1) else "odd"
s2="even" if((n&1)!=1) else "odd"
s3="even" if((n|1)>n) else "odd"
print(i,s1,s2,s3)
