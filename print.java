public class print{
    public static void print(){
        System.out.println();
    }

    public static void print(Object o){
        System.out.println(o);
    }

    public static void print(Object o,String s){
        System.out.print(o+s);
    }

    public static void printArray(int[] a){
        for(int x:a){
            print(x," ");
        }
        print();
    }

    public static void printArray(int[][] a){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a[x].length-1;y++){
                print(a[x][y]," ");
            }
            print();
        }
        print();
    }
}
