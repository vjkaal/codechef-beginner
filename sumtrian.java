import java.util.*;

class sumtrian extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int[][] arr=new int[n][n+1];
            printArray(arr);
            print("yes");
            for(int i=1;i<=n+1;i++){
                for(int j=0;j<i;j++){
                    arr[i][j]=in.nextInt();
                }
            }
            printArray(arr);
            print(arr[1][1]);
    }
}
