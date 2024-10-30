public class Main {
    public static int MAX2(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static int MAX3(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }
            else {
                return c;
            }
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.MAX2(12, 87));
        System.out.println(Main.MAX3(122, 12, 3));
    }
}