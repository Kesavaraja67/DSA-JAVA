public class Overloading {
    public static void main(String[] args) {

//        fun(23); // at compile time it will analyze which function should be called
//        fun("Kesava");
        int ans = sum(2,3);
        System.out.println(ans);

        int sol = sum(2,3,4);
        System.out.println(sol);

    }

    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }



    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }


}
