import java.util.*;

class MUFFINS extends print{
    public static void main(String[] args){
        Random rand=new Random();
        int t=10;
        int res=0;
        while(t-->0){
            int n=rand.nextInt(10);
            print(n);
            int rem=0;
            for(int i=1;i<n;i++){
                if(rem<=n%i){
                    rem=n%i;
                    res=i;
                    print(res+"\t"+rem);
                }
            }
            print(res);
            print();
        }
    }
}
