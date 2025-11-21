public class Main {

    //метод с проверкой аргумента для второй части
    private static void setAge(int age) {
        // Проверка корректности аргумента
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
    }

    public static void main(String[] args) {
        //Часть 1
        /*
        java.lang.Object
        базовый класс всех объектов в Java. все классы неявно наследуются от Object.

        java.lang.Throwable
        Базовый класс для всех объектов, которые могут быть выброшены как исключения.
        Содержит информацию об ошибке и стек вызовов.

        java.lang.Error
        Подкласс Throwable. Используется для критических ошибок, которые нельзя корректно обработать в программе.
        Чаще всего вызваны проблемами виртуальной машины. Не предназначены для перехвата.

        java.lang.Exception
        Подкласс Throwable. Используется для ситуаций, которые могут быть обработаны программой.
        Большинство исключений относится к этому типу. Требует обработки или объявления.

        java.lang.RuntimeException
        Подкласс Exception. Исключения времени выполнения.
        Возникают при логических ошибках программиста. Не требуют обязательной обработки.

        классы исключений используются для фиксации ошибок времени выполнения.
        ArithmeticException используется при ошибках арифметики
        ArrayIndexOutOfBoundsException используется при выходе индекса за границы массива
        IllegalArgumentException используется при передаче некорректного аргумента
        ClassCastException используется при неверном приведении типов
        NullPointerException используется при обращении к null ссылке
         */

        System.out.println("часть 2");

        //ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int c = a / b; //деление на ноль
        } catch (ArithmeticException ex) {
            System.out.println("Обработано исключение ArithmeticException");
        }

        //ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int x = arr[5]; //индекс вне массива
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Обработано исключение ArrayIndexOutOfBoundsException");
        }

        //IllegalArgumentException
        try {
            setAge(-5); //некорректный аргумент
        } catch (IllegalArgumentException ex) {
            System.out.println("Обработано исключение IllegalArgumentException");
        }

        //ClassCastException
        try {
            Object obj = "Строка";
            Integer num = (Integer) obj; //неверное приведение
        } catch (ClassCastException ex) {
            System.out.println("Обработано исключение ClassCastException");
        }

        //NullPointerException
        try {
            String text = null;
            int len = text.length(); //обращение к null
        } catch (NullPointerException ex) {
            System.out.println("Обработано исключение NullPointerException");
        }
    }
}
