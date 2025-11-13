public class Practice8 {
    public static void main(String[] args) {
        // Примеры вывода типа с var (local variable type inference)
        var age = 25;                     // тип: int
        var name = "Алексей";             // тип: String
        var pi = 3.14;                 // тип: double
        var numbers = java.util.Arrays.asList(10, 20, 30); // тип: List<Integer>
        // Сравнение с явным указанием интерфейса (лучшая практика для коллекций)
        java.util.List<String> cities = new java.util.ArrayList<>();
        cities.add("Москва");
        cities.add("Санкт-Петербург");
        // var тоже работает, но теряется абстракция интерфейса
        var countries = new java.util.ArrayList<String>();
        countries.add("Россия");
        countries.add("Казахстан");
        // Вывод результатов
        System.out.println("age = " + age + " тип: int");
        System.out.println("name = \"" + name + "\" тип: String");
        System.out.println("pi = " + pi + " тип: double");
        System.out.println("numbers = " + numbers + " тип: List<Integer>");
        System.out.println("cities (явный List) = " + cities);
        System.out.println("countries (var - ArrayList) = " + countries);
    }
}