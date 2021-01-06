import java.util.*;
import java.math.*;

class flow016{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            int c=(a<b)?a:b;
            int d=(a>b)?a:b;
            int gcd=gcd(c,d);
            BigInteger e=BigInteger.valueOf(c);
            BigInteger f=BigInteger.valueOf(d);
            System.out.println(gcd+" "+lcm(e,f,gcd));
        }
    }

    private static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }

    private static BigInteger lcm(BigInteger a,BigInteger b,int gcd){
        a=a.multiply(b);
        BigInteger g=BigInteger.valueOf(gcd);
        a=a.divide(g);
        return a;
    }
}
