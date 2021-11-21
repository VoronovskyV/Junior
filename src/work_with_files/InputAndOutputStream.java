package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Пример того как прочитать фотографию

public class InputAndOutputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream
                ("C:\\Users\\Voronovsky\\Desktop\\original.png");
             FileOutputStream outputStream = new FileOutputStream
                     ("java_pic.jpeg")) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
