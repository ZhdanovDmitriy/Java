public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Бобик", 3);

        dog1.introduce();
        System.out.println();

        dog2.introduce();
        System.out.println();

        dog1.play();
        dog2.play();


        /*
         = == = = = = = = = = Вторая часть = = == = = == = == = =
         */
        //вызов super.a и super.method() в классе C успешно обратится к полю a и методу method() из класса A1,
        //потому что они наследуются через B
        C c = new C();
        c.method();

        /*
         == = = = == = == = = = Третья часть = = = = == = = = ==
         */
        A obj1 = new A();
        A obj2 = new A(10);
        A obj3 = new A(10, 20);
        A obj4 = new A(10, 20, 30);

        A.print(obj1);
        A.print(obj2);
        A.print(obj3);
        A.print(obj4);
    }
}

class A1 {
    int a = 100;

    void method() {
        System.out.println("A1.method() вызван, a = " + a);
    }
}

class B extends A1 {
    // Пустой — a и method() не переопределяются
}

class C extends B {
    void method() {
        //super.a обращается к полю a класса A1 (через B, где оно унаследовано)
        int localA = super.a;
        System.out.println("В C: super.a = " + localA);

        //super.method() вызывает метод из A1 (B его не переопределяет)
        super.method();
    }
}