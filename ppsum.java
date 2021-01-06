import java.util.*;

class ppsum{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int d=in.nextInt();
            int n=in.nextInt();
            int sum=0;
            for(int i=0;i<d;i++){
                sum=n*(n+1)/2;
                n=sum;
            }
            System.out.println(n);
        }
    }
}
