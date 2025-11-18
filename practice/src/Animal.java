class Animal {
    String name;
    int age;

    Animal(String name) {
        this.name = name;
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Я — " + name);
    }

    void live() {
        System.out.println(name + " жив.");
    }
}

class Dog extends Animal {

    //1. вызов конструктора суперкласса
    Dog(String name) {
        super(name);
    }

    //2. вызов перегруженного конструктора суперкласса
    Dog(String name, int age) {
        super(name, age);
    }

    //3. вызов метода суперкласса
    @Override
    void introduce() {
        super.introduce();
        System.out.println("Точнее — собака.");
    }

    void play() {
        super.live();
        System.out.println(name + " играет.");
    }
}