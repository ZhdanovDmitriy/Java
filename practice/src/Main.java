public class Main {
    public static void main(String[] args) {
        new A(100);
    }
    /*
    Вывод:
    static logic
    logic (1) id= 0
    logic (2) id= 1
    ctor id= 100
    При первом обращении к A — загружается класс - выполняется static-блок
    При new A(100):
        Объект создаётся, id получает значение по умолчанию 0
        Выполняется первый instance-блок: печатает id = 0
        Выполняется инициализация id = 1
        Выполняется второй instance-блок: печатает id = 1
    Выполняется тело конструктора: id = 100, печатает ctor id= 100
     */
}