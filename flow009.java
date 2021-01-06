import java.util.*;

class flow009{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int q=in.nextInt();
            int p=in.nextInt();
            if(q>1000){
                double r=q*p*90.0/100.0;
            }
            else{
                double r=q*p;
            }
            System.out.println(r);
        }
    }
}
