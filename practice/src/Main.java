import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("часть 1: Приведите пример использования одного из подклассов класса InputStream для демонстрации работы метода read().");
        try (FileInputStream fis = new FileInputStream("example.txt")) { //подкласс InputStream
            int b;
            while ((b = fis.read()) != -1) { //чтение по одному байту
                System.out.print((char) b);
            }
            System.out.println(); //переход на новую строку
        } catch (IOException ex) {
            System.out.println("ошибка ввода: " + ex.getMessage());
        }
        System.out.println();

        //чатсь 2
        System.out.println("часть 2: Приведите пример использования одного из подклассов класса OutputStream для демонстрации работы метода write(int).");
        try (FileOutputStream fos = new FileOutputStream("output.txt")) { //подкласс OutputStream
            String text = "пример записи";
            for (char c : text.toCharArray()) {
                fos.write(c); //запись одного байта
            }
        } catch (IOException ex) {
            System.out.println("ошибка вывода: " + ex.getMessage());
        }
        System.out.println();

        /*
        часть 3: Если есть иерархия байтовых потоков ввода-вывода,
        основанная на абстрактных классах InputStream и OutputStream, то зачем дополнительные иерархии,
        основанные на абстрактных классах Reader и Writer?
        InputStream и OutputStream работают с байтами, не учитывая кодировку
        Reader и Writer предназначены для работы с символами (Unicode), упрощают работу с текстом и учитывают кодировку
         */

        /*
        часть 4: Зачем нужен интерфейс AutoCloseable? Приведите пример.
        Позволяет автоматически закрывать ресурсы при выходе из блока try-with-resources.
        Обеспечивает корректное освобождение ресурсов (файлы, сетевые соединения, потоки)
        без явного вызова close().
         */
        try (MyResource res = new MyResource()) {
            res.doSomething();
        }
    }
}

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
    public void doSomething() {
        System.out.println("Используем ресурс");
    }
}
