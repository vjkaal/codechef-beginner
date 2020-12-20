import java.util.*;

class amr15a extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int even=0,odd=0;
        while(n-->0){
            int a=in.nextInt();
            if(a%2==0) even+=1;
            else odd++;
        }
        if(even>odd) print("READY FOR BATTLE");
        else print("NOT READY");
    }
}
