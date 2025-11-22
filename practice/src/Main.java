public class Main {
    public static void main(String[] args) {
        try {
            testMethod();
        } catch (MyException ex) {
            System.out.println("Перехвачено MyException");
            System.out.println("Сообщение: " + ex.getMessage());
        }
    }

    //метод генерирует собственное исключение
    private static void testMethod() throws MyException {
        throw new MyException("Ошибка внутри testMethod");
    }
}
