import java.util.Formatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("часть 1");
        Formatter fmt = new Formatter();
        boolean boolVal = true;
        int intVal = 123;
        double doubleVal = 45.678;
        char charVal = 'A';
        String strVal = "Строка";

        //%b логическое значение
        fmt.format("Логическое значение: %b%n", boolVal);

        //%c символ
        fmt.format("Символ: %c%n", charVal);

        //%d десятичное целое
        fmt.format("Целое число: %d%n", intVal);

        //%f число с плавающей точкой
        fmt.format("Дробное число: %f%n", doubleVal);

        //%s строка
        fmt.format("Строка: %s%n", strVal);

        //вывод накопленного текста
        System.out.println(fmt.toString());

        //практика 2
        //метод flush очищает буфер и передает накопленные данные в поток вывода
        System.out.println("часть 2");
        System.out.println("четод flush очищает буфер и передает накопленные данные в поток вывода");

        //практика 3
        System.out.println("часть 3");

        Formatter fmt2 = new Formatter();
        Date date = new Date();

        //%tH час 00 23
        fmt2.format("Час 24 формата: %tH%n", date);

        //%tM минуты
        fmt2.format("Минуты: %tM%n", date);

        //%tS секунды
        fmt2.format("Секунды: %tS%n", date);

        //%tY год 4 цифры
        fmt2.format("Год: %tY%n", date);

        //%tB название месяца
        fmt2.format("Месяц: %tB%n", date);

        System.out.println(fmt2.toString());

        //закрытие форматтеров
        fmt.close();
        fmt2.close();
    }
}
