n=int(input())
even,odd=0,0
a=list(map(int,input().split()[:n]))
for x in a:
    if(x%2==0): even+=1
    else: odd+=1
print(even,odd)
print("READY FOR BATTLE") if(even>odd) else print("NOT READY")
