import java.util.*;

class permut2 extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t!=0){
            while(t!=0){
                int arr[]=new int[t];
                for(int i=0;i<t;i++){
                    arr[i]=in.nextInt();
                }

                //chk ambiguous
                int arr2[]=new int[t];
                for(int i=0;i<t;i++){
                    int x=i;
                    int y=arr[i];
                    arr2[y-1]=++x;
                }
                printArray(arr);
                printArray(arr2);
                String s=(Arrays.equals(arr,arr2))?"ambiguous":"not ambiguous";
                System.out.println(s);
                t=in.nextInt();
            }
        }
    }
}
