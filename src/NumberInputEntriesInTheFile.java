import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NumberInputEntriesInTheFile {
    public static void main(String[] args) throws IOException {
        File file = new File("listofprograms.txt");
//        String s = null;
        File file1 = new File("newfile.txt");
        file1.createNewFile();

        try {
            Scanner scanner = new Scanner(file);
//            String[] s = scanner.nextLine().split(" ");
            String hello = scanner.next("Java program to");
            
            System.out.println(hello);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
