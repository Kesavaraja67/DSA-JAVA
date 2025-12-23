import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1,2,3,4,5,6,7,7);
//        fun();
//        multiple(1,2,"Kesava","Raja");
//          demo(1,2,3,4,5);
//          demo("Kes","Ava","Raj","Aaa");
//        demo(); // ambiguity


    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }


    static void multiple(int a, int b, String...v){

    }

    static void fun(int...n){
        System.out.println(Arrays.toString(n));
    }
}
