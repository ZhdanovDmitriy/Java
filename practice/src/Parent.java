class Parent {
    public void calculate() {
        System.out.println("Посчитано в родителе");
    }
}

class Child extends Parent {
    /*
    Когда использование аннотации @Override помогает обнаружить ошибку?

    Если мы хотели переопределить метод calculate(),
    но по ошибке написал calcluate(), то без @Override код скомпилируется,
    и просто появится новый метод calcluate() - это ошибка, которую мы не ожидаем.
    Родительский метод не переопределен и будет работать не так, как нам хочется.
    С @Override компилятор сразу сообщит об ошибке и спасет нас от опечатки.

    public void calcluate() {
        System.out.println("Посчитано в наследнике");
    }
    */

    @Override
    public void calculate() {
        System.out.println("Посчитано в наследнике");
    }
}