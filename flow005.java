import java.util.*;

class flow005 extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int notes[]={1,2,5,10,50,100};
        //printArray(notes);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int m=minNotes(notes,n);
            print(m);
        }
    }

    private static int minNotes(int[] arr,int x){
        int val=0,res=0;
        for(int i=arr.length-1;i>=0;i--){
            while(val<x){
                if((val+arr[i])<=x){
                val+=arr[i];
                print(val+"-"+arr[i]);
                res+=1;
                }
                else break;
            }
       }
       return res;
    }
}
