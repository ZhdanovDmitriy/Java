/*
Что произойдет при выполнении данного кода?
    public class App {
        final static int START_COUNTER;
        static {
            START_COUNTER = Integer.parseInt("Y-");
        }
        public static void main(String[] args) {
            System.out.println("Hello");
        }
    }

Ответ:При выполнении кода произойдет ошибка во время инициализации класса, т.к в статическом блоке
выполняется START_COUNTER = Integer.parseInt("Y-"). Метод Integer.parseInt ожидает строку,
содержащую корректное целое число. Строка "Y-" не является числом, поэтому будет выброшено исключение:
java.lang.NumberFormatException. Так как исключение возникает при инициализации статической переменной,
класс не будет загружен, и метод main вызван не будет.
*/