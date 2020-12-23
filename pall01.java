import java.util.*;

class pall01 extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int m=reverse(n);
            if(n==m){
                print("wins");
            }
            else print("loses");
        }
    }

    private static int reverse(int x){
        int a=x,b=0;
        while(a>0){
            int temp=a%10;
            b=b*10+temp;
            a/=10;
        }
        return b;
    }
}
