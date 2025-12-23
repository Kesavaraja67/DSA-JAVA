public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Kesava";

//        System.out.println(num); // cannot print because is in another function
//        System.out.println(marks);


        // block{}
        {
//             int a = 33; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100;// reassign the origin ref variable to some other value
            System.out.println(a);
            name = "Raja";
            System.out.println(name); // same for string, we can modify the value.

             int c = 99;
             // values initialised in this block, will remain in the block
        }
        System.out.println(name);
        int c = 1000;

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
//        System.out.println(i); // cannot print i because it is outside the loop

//        System.out.println(c);   //cannot use outside the block
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

            /*
            Anything that are initialised outside the block
            can be used inside block
            and anything that are initialised inside the block
            cannot be used outside the block.
             */

            /*
            Anything that are initialised inside the block can be
            again initialise outside the block
             */
