public class Main {
    public static void main(String[] args) {
        // Перегрузка: вызов разных версий print в одном классе
        OverloadExample example = new OverloadExample();
        example.print();//"Печать без аргументов"
        example.print("Привет");//"Печать строки: Привет"
        example.print(42);//"Печать числа: 42"
        example.print("Тест", 5); //"Печать строки и числа: Тест, 5"

        System.out.println();

        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();//"Животное издаёт звук"
        d.sound();//"Собака гавкает"

        // Полиморфизм
        Animal animalDog = new Dog();
        animalDog.sound();//"Собака гавкает"
    }
}

class OverloadExample {
    //без параметров
    public void print() {
        System.out.println("Печать без аргументов");
    }
    //String
    public void print(String s) {
        System.out.println("Печать строки: " + s);
    }
    //int
    public void print(int n) {
        System.out.println("Печать числа: " + n);
    }
    //два параметра
    public void print(String s, int n) {
        System.out.println("Печать строки и числа: " + s + ", " + n);
    }

    //не перегрузка, а ошибка компиляции:
    //public int print(String s) {}  // ошибка т.к. сигнатура совпадает с print(String)
    //возвращаемый тип не участвует в перегрузке
}

class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака гавкает");
    }
}