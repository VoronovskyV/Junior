package work_with_files;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("test2.txt");
             FileWriter writer = new FileWriter("test2.txt", true)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println();
            System.out.println("Done");
        } catch (IIOException e) {
            e.printStackTrace();
        }
    }
}
