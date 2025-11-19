public class Main {
    //часть 1
    //публичный внутренний класс доступен везде, где доступен внешний класс Main
    public class PublicInner {
        public void print() {
            System.out.println("публичный внутренний класс доступен везде, где доступен внешний класс Main");
        }
    }

    //защищенный внутренний класс доступен внутри Main и его подклассах
    protected class ProtectedInner {
        public void print() {
            System.out.println("защищенный внутренний класс доступен внутри Main и его подклассах");
        }
    }

    //внутренний класс с уровнем package доступен только внутри того же пакета
    class DefaultInner {
        public void print() {
            System.out.println("внутренний класс с уровнем package доступен только внутри того же пакета");
        }
    }

    //приватный внутренний класс доступен только внутри внешнего класса Main
    private class PrivateInner {
        public void print() {
            System.out.println("приватный внутренний класс доступен только внутри внешнего класса Main");
        }
    }
    //поля внешнего класса
    private int privateValue = 10;
    public int publicValue = 20;

    //часть 2
    class InnerAccessExample {
        /*
        Имеет ли внутренний класс доступ к полям и методам внешнего класса?

        Да, внутренний класс имеет доступ ко всем полям и методам внешнего класса, включая private.
        Это правило действует независимо от модификаторов доступа
         */
        public void showAccess() {
            System.out.println("Доступ к приватному полю внешнего класса: " + privateValue);
            System.out.println("Доступ к публичному полю внешнего класса: " + publicValue);
        }
    }

    //часть 3
    /*
    Имеет ли внешний класс доступ к полям и методам внутреннего класса?

    Да, но доступ зависит от модификатора доступа самого внутреннего класса и его полей
     */
    class Car {
        private String model = "Toyota";
        public int year = 2020;

        public String getModel() {
            return model;
        }
    }

    public void testOuterAccess() {
        Car car = new Car();
        //доступ к публичному полю внутреннего класса возможен
        System.out.println("Доступ к публичному полю внутреннего класса: " + car.year);
        // Прямой доступ к приватному полю внутреннего класса невозможен - будет ошибка
        // System.out.println(car.model);

        // Но доступ возможен через getter, который предоставляет внутренний класс
        System.out.println("Доступ к приватному полю через метод: " + car.getModel());
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Часть 1");
        Main.PublicInner pub = main.new PublicInner();
        pub.print();
        Main.ProtectedInner prot = main.new ProtectedInner();
        prot.print();
        Main.DefaultInner def = main.new DefaultInner();
        def.print();
        PrivateInner priv = main.new PrivateInner();
        priv.print();

        System.out.println();
        System.out.println("Часть 2");
        InnerAccessExample ie = main.new InnerAccessExample();
        ie.showAccess();

        System.out.println();
        System.out.println("Часть 3");
        main.testOuterAccess();
    }
}
