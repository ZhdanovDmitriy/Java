public class Main {
    public static void main(String[] args) {
        String s = "стрОка";
        //length() - возвращает длину строки
        System.out.println("Длина строки: " + s.length());
        //charAt() - возвращает символ по индексу
        System.out.println("Символ под индексом 1: " + s.charAt(1));
        //contains() - проверяет, содержит ли строка подстроку
        System.out.println("Содержит 'World': " + s.contains("стр"));
        //startsWith() - проверяет, начинается ли строка с подстроки
        System.out.println("Начинается с 'Hell': " + s.startsWith("стр"));
        //endsWith() - проверяет, заканчивается ли строка подстрокой
        System.out.println("Заканчивается на 'ld': " + s.endsWith("ка"));
        //toUpperCase() - преобразует строку в верхний регистр
        System.out.println("В верхнем регистре: " + s.toUpperCase());
        //toLowerCase() - преобразует строку в нижний регистр
        System.out.println("В нижнем регистре: " + s.toLowerCase());
        //replace() - заменяет символы или подстроки
        System.out.println("Замена 'к' на '*': " + s.replace("к", "*"));
        //substring() - возвращает подстроку по индексам
        System.out.println("Подстрока (1–3): " + s.substring(1, 3));
        //split() - разделяет строку по разделителю и возвращает массив
        String[] arr = s.split("О");
        System.out.println("Результат split по символу О: " + arr[0] + " | " + arr[1]);

        //часть 2
        System.out.println("Пример 1\n");
        java.util.StringJoiner joiner1 = new java.util.StringJoiner(", ");
        joiner1.add("слово").add("не").add("воробей");
        System.out.println(joiner1);

        System.out.println("\nПример 2 с префиксом и суффиксом");
        java.util.StringJoiner joiner2 = new java.util.StringJoiner(" | ", "[", "]");
        joiner2.add("слово").add("не").add("воробей");
        System.out.println(joiner2);

        System.out.println("\nПример 3 с использование merge");
        java.util.StringJoiner j1 = new java.util.StringJoiner(", ");
        j1.add("1").add("2");
        java.util.StringJoiner j2 = new java.util.StringJoiner(", ");
        j2.add("3").add("4");
        j1.merge(j2);
        System.out.println(j1);

        //часть 3
        /*
        В Java """ используются для создания текстовых блоков
        Возможности текстового блока:
        1. Удобное написание многострочного текста
        2. Сохранение форматирования
        3. Не нужно экранировать большинство специальных символов
        Пример:
        */

        String json = """
                      {
                        "name": "Alice",
                        "age": 25
                      }
                      """;

        System.out.println("\nТекстовый блок:");
        System.out.println(json);
    }
}
