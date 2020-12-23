import java.util.*;

class flow010 extends print{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            char c=in.next().charAt(0);
            //print(c);
            String s=id(c);
            print(s);
        }
    }

    private static String id(char x){
        String s;
        if(x=='b'||x=='B') s="BattleShip";
        else if(x=='c'||x=='C') s="Cruiser";
        else if(x=='d'||x=='D') s="Destroyer";
        else s="Frigate";
        return s;
    }
}
