import java.util.*;

class operators extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            int b=in.nextInt();
            if(a<b) print('<');
            else if(a==b) print('=');
            else print('>');
        }
    }
}
