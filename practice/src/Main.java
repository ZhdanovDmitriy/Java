public class Main {
    public static void main(String[] args) {
        //первое исключение будет перехвачено
        try {
            int a = 10;
            int b = 0;
            int c = a / b; //генерация ArithmeticException
        } catch (ArithmeticException ex) {
            System.out.println("Перехвачено исключение ArithmeticException");
        }

        System.out.println("Продолжение работы после первого исключения");

        //второе исключение не перехватывается
        //приводит к аварийному завершению
        String text = null;
        int len = text.length(); //генерация NullPointerException

        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "text" is null
        //at Main.main(Main.java:17)
        
        System.out.println("Эта строка не выполнится");
    }
}
