import java.util.*;

class diffsum extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=(a>b)?(a-b):(a+b);
        print(c);
    }
}
