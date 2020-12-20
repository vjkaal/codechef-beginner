import java.util.*;
import java.lang.Math;

class cielrcpt extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int p=in.nextInt();
            int q=maxPower(p);
            print(q);
            int r=minMenus(p,q);
            print(r);
        }
    }

    private static int maxPower(int a){
        int res=0;
        for(int i=0;i<12;i++){
            double q=Math.pow(2,i);
            if(q>a){
                res=i-1;
                break;
            }
        }
        print(res);
        return res;
    }

    private static int minMenus(int p,int q){
        int res=0,val=0;
        for(int i=q;i>0;i--){
            double pow=Math.pow(2,i);
            while(val!=p){
                if((val+pow)<=p){
                    val+=pow;
                    res+=1;
                    print(val+"-"+pow+", ");
                }
                else{
                    break;
                }
            }
        }
        print();
        return res;
    }
}
