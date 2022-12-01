package string_search;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class string_search {

    public static void main(String[] args) {
        // System.out.println(args[0]);
        Scanner scan = new Scanner(System.in);
        String fileName;
        System.out.println("Enter file name: ");
        fileName = scan.next();
        System.out.println("Enter searchword: ");
        String search = scan.next();
        scan.close();
        System.out.println(fileName);
        Scanner fileReader;
        try {
            fileReader = new Scanner(new File(fileName));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.contains(search)){
                    System.out.println(line);
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file name!");
        }
    }

}
