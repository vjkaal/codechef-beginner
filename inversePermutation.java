import java.util.*;

class inversePermutation extends print{
    public static void main(String[] args){
        //Scanner in=new Scanner(System.in);
        int arr[]={3,5,2,1,4,6};
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int j=arr[i];
            int x=i;
            arr2[j-1]=++x;
        }
        printArray(arr);
        printArray(arr2);
        String s=(Arrays.equals(arr,arr2))?"ambiguous":"not ambiguous";
        print(s);
    }
}
