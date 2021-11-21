package shpargalki_algoritmov.textIO;

import java.io.FileWriter;
import java.io.IOException;

/*
    Пример того как записывать информацию в файл с помощью FileWriter!
 */
public class FileNewFileIO {
    public static void main(String[] args) throws IOException {
        String rubai = " Много лет размышлял я над жизнью земной." +
                "Непонятного нет для меня под луной." +
                "Мне известно, что мне ничего не известнео!" +
                "Вот последняя правда, открытая мной.";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Voronovsky\\Desktop\\1.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }

}
