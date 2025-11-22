//собственный класс исключения
//наследуется от Exception
public class MyException extends Exception {
    public MyException() {
        super("Произошло пользовательское исключение MyException");
    }
    //конструктор с сообщением
    public MyException(String message) {
        super(message);
    }
}