public static void main(String[] args) {
    // Присваивание и составные операторы
    int a = 5;
    System.out.println("a = 5");
    a += 3;
    System.out.println("a += 3 | " + a);
    a -= 2;
    System.out.println("a -= 2 | " + a);
    a *= 4;
    System.out.println("a *= 4 | " + a);
    a /= 3;
    System.out.println("a /= 3 | " + a);
    a %= 5;
    System.out.println("a %= 5 | " + a);

    String s = "Строка";
    System.out.println("s = \"Строка\" | " + s);
    s += " + Строка";
    System.out.println("s += \" + Строка\" | " + s);

    // Тернарный оператор
    int x = 10, y = 20;
    int max = (x > y) ? x : y;
    System.out.println("(x > y) ? x : y | " + max);
    String msg = (x < y) ? "меньше" : "больше";
    System.out.println("(x < y) ? \"меньше\" : \"больше\" | " + msg);

    // Логические операторы
    boolean b1 = true, b2 = false;
    boolean or = b1 || b2;
    System.out.println("true || false | " + or);
    boolean and = b1 && b2;
    System.out.println("true && false | " + and);

    // Побитовые: |, ^, &
    int c = 5 | 3;
    System.out.println("5 | 3 = " + c);
    boolean bor = true | false;
    System.out.println("true | false | " + bor);

    int d = 5 ^ 3;
    System.out.println("5 ^ 3 = " + d);
    boolean bxor = true ^ false;
    System.out.println("true ^ false | " + bxor);

    int e = 5 & 3;
    System.out.println("5 & 3 = " + e);
    boolean band = true & false;
    System.out.println("true & false | " + band);

    // Сравнения
    int p = 10, q = 20;
    System.out.println("p == q | " + (p == q));
    System.out.println("p != q | " + (p != q));
    System.out.println("p > q | " + (p > q));
    System.out.println("p >= q | " + (p >= q));
    System.out.println("p < q | " + (p < q));
    System.out.println("p <= q | " + (p <= q));

    String s1 = "a", s2 = new String("a");
    System.out.println("s1 == s2 | " + (s1 == s2) + " (сравнение ссылок!)");
    System.out.println("s1 != s2 | " + (s1 != s2));
    System.out.println("s1.equals(s2) | " + s1.equals(s2) + " (сравнение содержимого)");

    // Побитовые сдвиги
    int n = 8;
    System.out.println("n << 1 = " + (n << 1));
    System.out.println("n >> 1 = " + (n >> 1));
    System.out.println("n >>> 1 = " + (n >>> 1));

    // +, -
    int sum = 5 + 3;
    System.out.println("5 + 3 = " + sum);
    int diff = 5 - 3;
    System.out.println("5 - 3 = " + diff);
    String conc = "Hi" + " there";
    System.out.println("\"Hi\" + \" there\" = \"" + conc + "\"");

    // *, /, %
    int mul = 6 * 7;
    System.out.println("6 * 7 = " + mul);
    int div = 10 / 3;
    System.out.println("10 / 3 = " + div);
    int mod = 10 % 3;
    System.out.println("10 % 3 = " + mod);

    // Инкремент/декремент
    int i = 5;
    int postInc = i++;
    System.out.println("i = 5; postInc = i++ | postInc = " + postInc + ", i = " + i);
    int preInc = ++i;
    System.out.println("preInc = ++i | preInc = " + preInc + ", i = " + i);
    int postDec = i--;
    System.out.println("postDec = i-- | postDec = " + postDec + ", i = " + i);
    int preDec = --i;
    System.out.println("preDec = --i | preDec = " + preDec + ", i = " + i);

    // Унарные ~ и !
    int notBits = ~5;
    System.out.println("~5 = " + notBits);
    boolean notBool = !true;
    System.out.println("!true = " + notBool);

    // ( ) и [ ]
    int group = (2 + 3) * 4;
    System.out.println("(2 + 3) * 4 = " + group);
    int[] arr = {1, 2, 3};
    int first = arr[0];
    System.out.println("arr[0] = " + first);



    /*
        ВТОРАЯ ЧАСТЬ ПРАКТИКИ
     */

    // Обычные объекты
    Object obj1 = "Строка";
    Object obj2 = new Integer(42);
    Object obj3 = new ArrayList<String>();

    System.out.println("obj1 = \"Строка\"");
    System.out.println("obj1 instanceof String = " + (obj1 instanceof String));
    System.out.println("obj1 instanceof Object = " + (obj1 instanceof Object));
    System.out.println("obj1 instanceof CharSequence = " + (obj1 instanceof CharSequence));
    System.out.println("obj1 instanceof Integer = " + (obj1 instanceof Integer));

    System.out.println();

    System.out.println("obj2 = new Integer(42)");
    System.out.println("obj2 instanceof Integer = " + (obj2 instanceof Integer));
    System.out.println("obj2 instanceof Number = " + (obj2 instanceof Number));
    System.out.println("obj2 instanceof Object = " + (obj2 instanceof Object));
    System.out.println("obj2 instanceof String = " + (obj2 instanceof String));

    System.out.println();

    System.out.println("obj3 = new ArrayList<String>()");
    System.out.println("obj3 instanceof ArrayList = " + (obj3 instanceof ArrayList));
    System.out.println("obj3 instanceof List = " + (obj3 instanceof List));
    System.out.println("obj3 instanceof Collection = " + (obj3 instanceof Collection));
    System.out.println("obj3 instanceof Object = " + (obj3 instanceof Object));
    System.out.println("obj3 instanceof String = " + (obj3 instanceof String));

    System.out.println();

    // Случай с null
    Object objNull = null;
    System.out.println("objNull = null");
    System.out.println("objNull instanceof String = " + (objNull instanceof String));
    System.out.println("objNull instanceof Object = " + (objNull instanceof Object));
    System.out.println("objNull instanceof ArrayList = " + (objNull instanceof ArrayList));
    System.out.println("Для null оператор instanceof всегда возвращает false");
}