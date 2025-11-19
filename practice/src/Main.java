public class Main {
    //интерфейс с вложенным классом
    interface Vehicle {
        //вложенный класс по умолчанию является static
        class Car {
            private String brand;

            public Car(String brand) {
                this.brand = brand;
            }

            public void printBrand() {
                System.out.println("Марка автомобиля: " + brand);
            }
        }

        // Можно также определить статические методы внутри интерфейса
        static void info() {
            System.out.println("Это интерфейс Vehicle с вложенным классом Car.");
        }
    }

    public static void main(String[] args) {
        // Вызов статического метода интерфейса
        Vehicle.info();
        // Создание объекта вложенного класса
        Vehicle.Car myCar = new Vehicle.Car("Toyota");
        // Вызов метода объекта вложенного класса
        myCar.printBrand();
    }
}
