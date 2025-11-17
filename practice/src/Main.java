public class Main {
    public static void main(String[] args) {
        //через конструктор по умолчанию (с инициализацией в теле)
        A1 obj1 = new A1();
        System.out.println("A1.a = " + obj1.a);

        //через конструктор с параметром
        A2 obj2 = new A2(42);
        System.out.println("A2.a = " + obj2.a);

        //через блок инициализации экземпляра
        A3 obj3 = new A3();
        System.out.println("A3.a = " + obj3.a);

        //через конструктор + блок инициализации вместе
        A4 obj4 = new A4();
        System.out.println("A4.a = " + obj4.a);

        // Вариант 5: через наследование — инициализация в конструкторе подкласса через super(...)
        A5Base obj5 = new A5Sub();
        System.out.println("A5Base.a (через подкласс) = " + obj5.a);
    }
}

class A1 {
    public final int a;
    public A1() {
        a = 100;
    }
}

class A2 {
    public final int a;
    public A2(int value) {
        a = value;
    }
}

class A3 {
    public final int a;
    {
        a = 200;
    }
    public A3() {}
}

class A4 {
    public final int a;
    {
        int temp = Math.random() > 0.5 ? 10 : 20;
        a = temp;
    }
    public A4() {}
}

class A5Base {
    public final int a;
    public A5Base(int value) {
        a = value;
    }
}
class A5Sub extends A5Base {
    public A5Sub() {
        super(999);
    }
}