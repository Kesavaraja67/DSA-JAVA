public class Shadowing {
    static int x = 90; //this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //90
        int x;// the class variable at line 2 is shadowed by this
//      System.out.println(x); // scope will begin when value is initialised
        x = 33;
        System.out.println(x); //33
        fun(); //90

    }
    static void fun(){
        System.out.println(x);
    }
}
