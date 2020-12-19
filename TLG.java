import java.util.*;

class TLG{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Random rand=new Random();
        int n=10000;
        System.out.println(n);
        int lead=0;
        int player=0;
        int i=0;
        while(n-->0){
            int s=rand.nextInt(1000);
            int t=rand.nextInt(1000);
            System.out.println(s+" "+t);
            System.out.println(((s>t)?1:2)+" "+Math.abs(s-t));
            if(lead<Math.abs(s-t)){
                lead=Math.abs(s-t);
                player=(s>t)?1:2;
                System.out.println("("+player+" "+lead+")"+"\n");
            }
        }
        System.out.println(player+" "+lead);
    }

    /*
    private int search(int[] arr,int l){
        int h=0;
        int re=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>h){
                int temp=arr[i];
                arr[i]=h;
                h=temp;
                re=i;
            }
        }
        return re;
    }
    */
}

/*
private class quicksort{
    public quickSort(int[] A,int l,int h){
        if(l<h){
            int pi=partition(A,l,h);
            quickSort(A,l,pi-1);
            quickSort(A,pi+1,h);
        }
    }

    private int partition(int[] arr,int l,int h){
        int pivot=arr[h];
        int j=l-1;
        for(int i=0;i<h-1;i++){
            if(arr[i]<pivot){
                j++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        j++;
        int temp=arr[j];
        arr[j]=pivot;
        pivot=temp;
        return j;
    }
}
*/
