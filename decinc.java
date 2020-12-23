import java.util.*;

class decinc extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n%4==0){
            n++;
        }
        else n--;
        print(n);
    }
}
