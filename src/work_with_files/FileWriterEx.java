package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно!\n" +
                "Вот последняя правда, открытая мной.\n";
        String s = "Privet";
        try (FileWriter writer = new FileWriter("test2.txt", true)) {
            // В эту строку можно поместить как название местонахождения файла,
            // так и свое название, но файл создастся в корневой папке!
            //1. Первый метод реализации
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            // 2. Второй метод реализации
            writer.write(rubai);
            writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
