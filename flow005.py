import array as arr
import random as rand

def minNotes(arr,x):
    val,res=0,0
    #print(arr)
    #print(len(arr))
    for i in range((len(arr)-1),-1,-1):
        #print(arr[i])
        while(val<x):
            if((val+arr[i])<=x):
                val+=arr[i]
                res+=1
                print(val,arr[i])
            else:
                break;
    return(res)


t=rand.randint(1,1000)
arr=[1,2,5,10,50,100]
#print(arr)
for i in range(t):
    n=rand.randint(1,1000000)
    m=minNotes(arr,n)
    print(m)
