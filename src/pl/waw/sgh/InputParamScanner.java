package pl.waw.sgh;

import java.util.Scanner;

public class InputParamScanner {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner()
        System.out.println("This is an output");
        System.err.println("This is an error");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide your name: \t");
        //\t = tab
        //\n = new line(Msc and Unix)
        // \r\n = windows CRLF
        //while (scanner.hasNext()) {
        while (scanner.hasNextInt()) {
            //String name = scanner.next(); to lub integer
            Integer myint = scanner.nextInt();
            // if (name.equals("exit")) break;
            if (myint.equals(0)) break;
            //System.out.println("Hello " + name);
            System.out.println("I got " + myint);
            //while scanner
        }
    }
}

