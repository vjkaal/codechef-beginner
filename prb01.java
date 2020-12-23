import java.util.*;

class prb01 extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=100000;
        while(t-->0){
            int n=100000-t;
            String s=prime(n);
            //print(s);
        }
    }

    private static String prime(int x){
        String s;
        int d=0;
        if(x==1){
            s="no";
        }
        else if(x==2){
            s="yes";
        }
        else if(x%2==0){
            s="no";
        }
        else{
            for(int i=2;i<x;i++){
                if(x%i==0){
                    d+=1;
                }
                else d+=0;
            }
            if(d>=1){
                s="no";
            }
            else{
                s="yes";
            }
        }
        if(s=="yes") print(x);
        return s;
    }
}
