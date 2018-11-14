package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filereader {
    public static void main(String[] args) throws FileNotFoundException {
        //File inFile = new File("h:\\mytxtfile.txt");
        File inFile = new File("h:/lol.txt");
        //File inFile = new File("h:" + File.separator + "lol.txt");
        Scanner scanner = new Scanner(inFile);
        int i =1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(i + ": " + line);
            i++;
        }

    }
}
