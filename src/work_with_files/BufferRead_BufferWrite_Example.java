package work_with_files;

import java.io.*;
// Работа с BufferReader and BufferWriter
//Предназначен для работы с Текстом
// спользовать данные класы номного лучшече, потому что они быстрее в своей работе

public class BufferRead_BufferWrite_Example {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader
                (new FileReader("test2.txt"));
             BufferedWriter writer = new BufferedWriter
                     (new FileWriter("test3.txt"))) {
            //1. Метод
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            //2. Метод
//            String line;
//            while ((line =reader.readLine()) !=null) {
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;

    }
}
