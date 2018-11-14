package pl.waw.sgh;

public class Blocks {
    //visibility everywhere
    //public static int i0 = 5;
    //for static variables behaves like pubblic
    //protected visability - just to myself and following classes
    //protected static int i0 = 5
    //no visability operator
    // static int i0 = 5
    //private
   // private static int i0 = 5

    static int i0=5;
    //constatnt and final- cant e changed
    static final String MY_CONSTANT = "some text";

    private static void main(String[] args) {
        int i1=0;
        System.out.println(MY_CONSTANT);
        System.out.println("inside a block i0=" + i0);
        {
            System.out.println("inside a block i1=" + i1);
            int i2=5;
            System.out.println("inside a block i2=" + i2);
        }

        int i3=7;
        System.out.println("outside a block i1=" + i1);
        //System.out.println("outside a block i2=" + i2);
    }
}
