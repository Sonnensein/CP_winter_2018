package pl.waw.sgh;

public class Data_types {
    /*
    This is a comment
     */
    //psvm
    public static void main(String[] args) {
        byte b1 = 5;
        byte b2 = 120;
/*
        int i1 = 34987814;
        int i2 = 34248900;
        int i3 = i1 + i2;
*/
        int i1 = 34987814;
        int i2 = 34248900;

        long i3 = i1 + i2;

        //long i3 = i1 + i2;

        //sout
        //str(i3) - python
        System.out.println("i3: " + i3);

        int a = 5;
        int b,bb;
        b = a++;
        //a = 5; to odkomentujemy i mamy co innego
        bb = ++a;

        System.out.println("b=" + b);
        System.out.println("bb=" + bb);

         // ctrl+d - kopiowanie

        double d1 = 2;
        double d2 = 3;

        double d3 = Math.pow(d1,d2);

        System.out.println("d3=" + d3);
    }
}
