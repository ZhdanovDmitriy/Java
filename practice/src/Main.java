/**
 * Простой пример использования Javadoc.
 * @author Жданов Дмитрий
 * @since 1.2
 */
public class Main {

    /**
     * Точка входа в программу.
     * Запускает примеры вычислений с использованием калькулятора.
     * @param args аргументы командной строки игнорируются
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Даны числа: 5, 3");
        System.out.println("Сумма: " + calc.add(5, 3));
        System.out.println("Даны числа: 10, 2");
        System.out.println("Частное: " + calc.divide(10, 2));
        System.out.println("Даны числа: 1, 2");
        System.out.println("Старый метод сложения: " + calc.addOld(1, 2));
    }

    /**
     * Класс калькулятор
     */
    public static class Calculator {

        /**
         * Складывает два целых числа
         * @implSpec
         * Результат вычисляется как {@code a + b}
         * @implNote
         * Метод не проверяет переполнение. Для безопасного сложения
         * рекомендуется использовать {@link Math#addExact(int, int)}
         * @param a первое слагаемое
         * @param b второе слагаемое
         * @return сумма {@code a} и {@code b}
         * @since 1.1
         */
        public int add(int a, int b) {
            return a + b;
        }

        /**
         * Делит одно целое число на другое
         * @param dividend делимое
         * @param divisor  делитель (не должен быть равен нулю)
         * @return результат деления {@code dividend / divisor}
         * @throws ArithmeticException если {@code divisor == 0}
         * @since 1.2
         */
        public int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new ArithmeticException("Деление на ноль запрещено");
            }
            return dividend / divisor;
        }

        /**
         * Устаревший метод сложения
         * @deprecated Используйте {@link #add(int, int)}
         * @deprecatedForRemoval Этот метод будет удалён в версии 3.0
         * @since 1.0
         * @param x первое число
         * @param y второе число
         * @return сумма {@code x + y}
         * @see #add(int, int)
         */
        @Deprecated(since = "1.1", forRemoval = true)
        public int addOld(int x, int y) {
            return x + y;
        }
    }
}