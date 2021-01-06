import java.util.*;

class lapin extends print{

    public static String s="this";

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            String s=in.next();
            lapin.s=s;
            //print(s);
            int l=s.length();
            if((l&1)!=1){
                //print("even "+l);
                divide(l);
            }
            else{
                //print("odd "+l);
                divide(l);
            }
        }
    }

    private static void divide(int x){
        if(x%2==0){
            char[] c1=new char[x/2];
            char[] c2=new char[x/2];
            String s1=new String(c1);
            String s2=new String(c2);
            int l1=s1.length();
            int l2=s2.length();
            s1=getS1(l1);
            s2=getS2even(l2);
            print(s1+"\n"+s2);
            print(s1.equals(s2));
        }
        else{
            char[] c1=new char[x/2];
            char[] c2=new char[x/2-1];
            String s1=new String(c1);
            String s2=new String(c2);
            int l1=s1.length();
            int l2=s2.length();
            s1=getS1(l1);
            s2=getS2odd(l2+1);
            print(s1+"\n"+s2);
            print(s1.equals(s2));
        }
    }

    private static String getS1(int l){
        char[] c=new char[l];
        for(int i=0;i<l;i++){
            c[i]=lapin.s.charAt(i);
        }
        Arrays.sort(c);
        String s=new String(c);
        return s;
    }

    private static String getS2even(int l){
        char[] c=new char[l];
        for(int i=0;i<l;i++){
            c[i]=lapin.s.charAt(l+i);
        }
        Arrays.sort(c);
        String s=new String(c);
        return s;
    }

    private static String getS2odd(int l){
        char[] c=new char[l];
        for(int i=0;i<l;i++){
            c[i]=lapin.s.charAt(l+1+i);
        }
        Arrays.sort(c);
        String s=new String(c);
        return s;
    }
}
