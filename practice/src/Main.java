public class Main {
    //final-метод нельзя переопределить
    static class Parent {
        public final void doWork() {
            System.out.println("Работа выполнена");
        }
    }
    //попытка переопределить final-метод вызовет ошибку компиляции
    static class Child extends Parent {
        // public void doWork() {
        //     System.out.println("Попытка переопределить final-метод");
        // }
    }
    /*
     = = == = = = = = = = = == = Вторая часть практики = == = = = = = = =
     */

    //final-класс нельзя наследовать
    final static class FinalClass {
        public void action() {
            System.out.println("Действие final-класса");
        }
    }

    //ошибка компиляции:
    //static class Subclass extends FinalClass { }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.doWork();

        Child c = new Child();
        c.doWork();  //вызывается версия из Parent(мы в этом уверены, т.к. написали final в методе doWork)

        FinalClass f = new FinalClass();
        f.action();
    }
}