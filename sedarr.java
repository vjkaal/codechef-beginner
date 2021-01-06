import java.util.*;

class sedarr{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] A=new int[n];
            for(int i=0;i<n;i++){
                A[i]=in.nextInt();
            }
            int res=minOP(A,k);
            System.out.println(res);
        }
    }

    private static int minOP(int[] arr,int k){
        int sum=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        if(sum==k){
            res=0;
        }
        else if(sum<k){
            //arr[0]=sum-k;
            return 1;
        }
        else{
            //sort(arr,0,arr.length-1);
            //int l=findL(arr,k);
            //res=arr.length-l;
            //real answer
            //a=sum%k
            //k-=a
            //A[i]+=k
            res=1;
        }
        return res;
    }

    /*
    private static void sort(int[] arr,int start,int end){
        if(start<end){
            int pi=partition(arr,start,end);
            sort(arr,start,pi-1);
            sort(arr,pi+1,end);
        }
    }

    private static int partition(int[] arr,int start,int end){
        int pivot=arr[end];
        int j=start-1;
        int temp;
        for(int i=start;i<end;i++){
            if(arr[i]<=pivot){
                j++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[j+1];
        arr[j+1]=arr[end];
        arr[end]=temp;
        return (j+1);
    }

    private static int findL(int[] arr,int k){
        int beg=0,sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=k){
                beg=i;
                break;
            }
        }
        int res=arr.length-beg-1;
        for(int j=beg;j<arr.length;j++){
            arr[j]=1;
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum<k){
            res+=1;
        }
        else if(sum>k){
            int rem=sum-k;
            int i=beg-1;
            while(sum!=k){
                if(arr[i]>rem){
                    //arr[i]-=rem;
                    res+=1;
                    break;
                }
                else{
                    rem-=(arr[i]-1);
                    arr[i]=1;
                    i--;
                    sum-=(rem+1);
                    res+=1;
                }
            }
        }
        return res;
    }
    */
}
