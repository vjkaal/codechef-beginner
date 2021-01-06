import java.math.*;

class lnm{
    public static void main(String[] args){
        int a=243234;
        int b=347239;
        //String e=Integer.valueOf(a);
        //String f=Integer.valueOf(b);
        BigInteger c=BigInteger.valueOf(a);
        BigInteger d=BigInteger.valueOf(b);
        System.out.println(c+" "+d);
        c=c.multiply(d);
        System.out.println(c);
    }
}
