public class Main {
    static class Car {
        private String brand;
        private String model;
        private int year;

        public Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        @Override
        public boolean equals(Object obj) {
            //сравнение объекта с самим собой
            if (this == obj) return true;

            //проверка на null
            if (obj == null) return false;

            //проверка, что классы совпадают
            if (this.getClass() != obj.getClass()) return false;

            //приведение типа
            Car other = (Car) obj;

            //сравнение полей
            return year == other.year &&
                    (brand != null ? brand.equals(other.brand) : other.brand == null) &&
                    (model != null ? model.equals(other.model) : other.model == null);
        }

        @Override
        public int hashCode() {
            int result = (brand == null ? 0 : brand.hashCode());
            result = 31 * result + (model == null ? 0 : model.hashCode());
            result = 31 * result + year;
            return result;
        }
    }

    /*
    Соглашения, которым должен следовать метод equals():
    1. Рефлексивность:
       x.equals(x) всегда возвращает true

    2. Симметричность:
       если x.equals(y) возвращает true,
       то y.equals(x) также возвращает true

    3. Транзитивность:
       если x.equals(y) возвращает true
       и y.equals(z) возвращает true,
       то x.equals(z) также возвращает true

    4. Консистентность:
       повторные вызовы x.equals(y) должны возвращать один и тот же результат,
       если состояние объектов не изменилось

    5. Сравнение с null:
       вызов x.equals(null) всегда должен возвращать false

    6. Связь с hashCode():
       если два объекта равны согласно equals(),
       то их hashCode() должен быть одинаковым
     */
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Toyota", "Camry", 2020);
        Car car3 = new Car("Honda", "Civic", 2018);

        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.equals(car3): " + car1.equals(car3));
    }
}
