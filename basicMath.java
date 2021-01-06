import java.util.*;

class basicMath{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("a>b");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n"+(a%b));
    }
}
