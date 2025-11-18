class Animal {
    String name;

    Animal(String name) {
        //this.name - обращение к полю текущего объекта
        this.name = name;
    }

    void speak() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    // Конструктор подкласса
    Dog(String name) {
        //super(name) - вызов конструктора суперкласса (Animal)
        //обязателен при наследовании, если в суперклассе нет конструктора без параметров
        //должен быть первой инструкцией в конструкторе
        super(name);
    }

    @Override
    void speak() {
        //super.speak() - вызов метода суперкласса
        //используется, чтобы выполнить родительскую логику перед/после своей
        super.speak();

        System.out.println("Гав!");
    }

    void rename(String name) {
        //this.name - явное обращение к полю текущего экземпляра класса Dog
        //без this было бы неясно: присваиваем параметру самому себе или полю
        this.name = name;
    }

    // Альтернативный конструктор в том же классе
    Dog() {
        //перегрузка конструтора
        //позволяет избежать дублирования кода
        //должен быть первой строкой, как и super()
        this("Безымянный");
    }
}

/*
    = = == = = = = = = = = = = = = Втора часть практики = = = = == = = = =
 */

class A {
    int a1; //package-private
    public int a2; //public
    protected int a3; //protected
    private int a4; //private

    void method1() { } //package-private
    public void method2() { } //public
    protected void method3() { } //protected
    private void method4() { } //private
}

class B extends A {
    void testAccess() {
        // Доступ из подкласса B (в том же пакете, что и A)
        a1 = 1;        //ок, package-private - видно внутри пакета
        a2 = 2;        //ок, public - везде
        a3 = 3;        //ок, protected - в подклассах и в пакете
        // a4 = 4;     //не ок, private - только в самом классе A
        //Аналогично методы:
        method1();     //ок
        method2();     //ок
        method3();     //ок
        // method4();  //не ок
    }
}

class C extends B {
    void testAccess() {
        // Доступ из подкласса C (допустим, в другом пакете)
        // a1 = 1;     //не ок, если C в другом пакете - package-private не наследуется за пределы пакета
        a2 = 2;        //ок, public
        a3 = 3;        //ок, protected - наследуется в подклассах, даже в других пакетах
        // a4 = 4;     //не ок, private не наследуется

        // method1();  //не ок, если C в другом пакете
        method2();     //ок
        method3();     //ок
        // method4();  //не ок
    }
}