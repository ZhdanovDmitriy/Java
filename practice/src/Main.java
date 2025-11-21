class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class Main {
    public static void main(String[] args) {
        System.out.println("практика 1");

        //ситуация 1
        //несколько исключений обрабатываются абсолютно идентичным образом
        try {
            generateException1();
        } catch (ArithmeticException | NullPointerException ex) {
            System.out.println("Обработано исключение ArithmeticException или NullPointerException");
        }

        //ситуация 2
        //иерархия Ex1 < Ex2 < Ex3
        try {
            generateException2();
        } catch (Ex3 ex) {
            System.out.println("Обработано исключение Ex3");
        } catch (Ex2 ex) {
            System.out.println("Обработано исключение Ex2");
        } catch (Ex1 ex) {
            System.out.println("Обработано исключение Ex1");
        }

        /*
        Часть 2
        Ключевое слово final в catch означает что переменная e не может быть изменена внутри блока catch
        Вложенные блоки try поддерживаются и используются для локальной обработки исключений
         */
    }

    private static void generateException1() {
        int x = 10 / 0; // ArithmeticException
    }

    private static void generateException2() throws Ex1 {
        throw new Ex3();
    }
}
