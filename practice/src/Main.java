public class Main {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        //byte
        byte b = 1;
        switch (b) {
            case 1:
                System.out.println("byte: 1");
                break;
            case 2:
                System.out.println("byte: 2");
                break;
        }

        //short
        short s = 100;
        switch (s) {
            case 100:
                System.out.println("short: 100");
                break;
            case 101:
                System.out.println("short: 101");
                break;
        }

        //char
        char c = 'A';
        switch (c) {
            case 'A':
                System.out.println("char: A");
                break;
            case 'B':
                System.out.println("char: B");
                break;
        }

        //int
        int n = 3;
        switch (n) {
            case 3:
                System.out.println("int: 3");
                break;
            case 4:
                System.out.println("int: 4");
                break;
        }

        //Integer
        Integer integer = 5;
        switch (integer) {
            case 5:
                System.out.println("Integer: 5");
                break;
            case 6:
                System.out.println("Integer: 6");
                break;
        }

        //Character
        Character character = 'X';
        switch (character) {
            case 'X':
                System.out.println("Character: X");
                break;
            case 'Y':
                System.out.println("Character: Y");
                break;
        }

        //String
        String str = "str";
        switch (str) {
            case "str":
                System.out.println("String: str");
                break;
            case "str2":
                System.out.println("String: str2");
                break;
        }

        //enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum: Понедельник");
                break;
            case TUESDAY:
                System.out.println("enum: Вторник");
                break;
        }
        /*
        Классический switch не работает с:
        long, float, double, boolean, их обёртками (Long, Float и т.д.), произвольные классы
        Например, следующее вызовет ошибку компиляции:
        long l = 10L;
        switch (l) { ... }  // ОШИБКА: incompatible types
        */



        /*
         = = = = = = = Вторая часть практики = = = = = = = = = =
         */
        int input = 2;
        int i = 0;

        //пример с отсутствующим break в case 2
        switch (input) {
            case 1:
                i = 1;
                System.out.println("Выполнен case 1: i = " + i);
                break;
            case 2:
                i = 2;
                System.out.println("Выполнен case 2: i = " + i);
                // break отсутствует — выполнение "проваливается" в следующий case
            case 3:
                i = 3;
                System.out.println("Выполнен case 3: i = " + i);
                break;
            case 4:
                i = 4;
                System.out.println("Выполнен case 4: i = " + i);
                break;
            default:
                i = -1;
                System.out.println("Выполнен default: i = " + i);
        }

        // Результат: при input = 2 выполнится и case 2, и case 3
        // Потому что после case 2 нет break — управление переходит к case 3
        System.out.println("Итоговое значение i после switch: " + i);
        System.out.println();


        //проваливание в default
        input = 100;
        i = 0;
        switch (input) {
            case 100:
                i = 100;
                System.out.println("case 100: i = " + i);
                // break отсутствует
            default:
                i *= 2;
                System.out.println("default: i удвоен " + i);
                // break не обязателен в default, но без него — ничего страшного, если конец switch
        }
        System.out.println("При input = 100: i = " + i);
    }
}