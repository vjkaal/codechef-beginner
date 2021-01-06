import java.util.*;

class sumtrian extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int[][] arr=new int[n][n+1];
            printArray(arr);
            print("yes");
            for(int i=0;i<n+1;i++){
                for(int j=0;j<i;j++){
                    arr[i-1][j]=in.nextInt();
                }
            }
            printArray(arr);
            //print(arr[1][1]);
            //int size=int(n(n-1)/2)+1;
            int[] A=new int[n];
            int sum=0;
            int x=0;
            for(int i=0;i<n+1;i++){
                for(int j=0;j<i;j++){
                    print(arr[i-1][j]," ");

                }
                print();
            }
    }
}
