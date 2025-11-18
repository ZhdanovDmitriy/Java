public class Main {
    //перегрузка методов с переменным числом параметров на примере logger'а

    //одно сообщение
    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }

    //сообщение + переменное число параметров для подстановки
    public static void log(String format, Object... args) {
        String result = String.format(format, args);
        System.out.println("[LOG] " + result);
    }

    //уровень логирования + сообщение + аргументы
    public static void log(String level, String format, Object... args) {
        String result = String.format(format, args);
        System.out.println("[" + level.toUpperCase() + "] " + result);
    }

    public static void main(String[] args) {
        log("Простое сообщение");
        log("Числа: %d, %d, %d", 1, 2, 3);
        log("DEBUG", "Значение x = %.2f", 3.1415);
    }
}