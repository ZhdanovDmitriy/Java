public class Main {
    public static void main(String[] args) {
        //часть 1
        OverloadingExample over = new OverloadingExample();
        over.printValue(10);
        over.printValue(1.1);
        over.printValue("строка");

        //часть 2
        Animal a = new Animal();
        Dog d = new Dog();
        System.out.println(a.sound());
        System.out.println(d.sound());

        //часть 3
        Parent p = new Parent();
        Child c = new Child();
        p.calculate();
    }
}