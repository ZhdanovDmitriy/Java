interface Vehicle {
    //неабстрактный метод
    default void start() {
        System.out.println("Транспортное средство заводится");
    }
    //статический метод интерфейса
    static void info() {
        System.out.println("Это интерфейс Vehicle с default и static методами");
    }
}
//класс, реализующий интерфейс
class Car implements Vehicle {

    //можно переопределить default метод при необходимости
    @Override
    public void start() {
        System.out.println("Автомобиль заводится");
    }

    public void drive() {
        System.out.println("Автомобиль едет");
    }
}

class Main {
    public static void main(String[] args) {
        //вызов статического метода интерфейса напрямую
        Vehicle.info();
        //создание объекта класса, реализующего интерфейс
        Car car = new Car();
        //вызов default метода через объект
        car.start();
        //вызов собственного метода класса
        car.drive();
    }
}


/*
Часть 2
*/

interface InterfaceA {
    default void hello() {
        System.out.println("Привет из InterfaceA");
    }
}

interface InterfaceB {
    default void hello() {
        System.out.println("Привет из InterfaceB");
    }
}

//класс, реализующий оба интерфейса
class MyClass implements InterfaceA, InterfaceB {

    //конфликт одинаковых default методов нужно разрешить вручную
    @Override
    public void hello() {
        //можно выбрать метод одного из интерфейсов
        InterfaceA.super.hello(); //вызов метода из InterfaceA
        InterfaceB.super.hello(); //вызов метода из InterfaceB
        System.out.println("вызвано из MyClass");
    }
    /*
    Если класс реализует два интерфейса с одинаковыми default методами,
    компилятор выдаст ошибку, если не переопределить метод в классе
    Для решения данной проблемы можно:
    1. переопределить метод в классе
    2. внутри переопределенного метода явно вызвать нужный default метод через InterfaceName.super.methodName()
    */
}

class Test {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.hello();
    }
}


