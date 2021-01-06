import java.util.*;

class trisq{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int b=in.nextInt();
            int c=(b/2)-1;
            int res=0;
            for(int i=1;i<=c;i++){
                res+=i;
            }
            System.out.println(res);
        }
    }
}
