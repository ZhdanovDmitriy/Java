public class Practice5 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int result1 = b + s; // b привелось к int, результат int по правилу неявного приведения типов
        System.out.println("byte + short = " + result1 + " (type: int)");
        int i = 100;
        long l = 200L;
        long result2 = i + l; // i привелось к long, результат long по правилу неявного приведения типов
        System.out.println("int + long = " + result2 + " (type: long)");
        long l2 = 1000L;
        float f = 3.14f;
        float result3 = l2 + f; // l2 привелось к float, результат float по правилу неявного приведения типов
        System.out.println("long + float = " + result3 + " (type: float)");
        float f2 = 2.5f;
        double d = 1.75;
        double result4 = f2 + d; //f2 привелось к double, результат double по правилу неявного приведения типов
        System.out.println("float + double = " + result4 + " (type: double)");
        char c = 'A'; // ASCII 65
        int result5 = c + 10; //char + int = int (char — unsigned 16-bit, но при вычислениях преобразуется в int)
        System.out.println("'A' + 10 = " + result5 + " (type: int)");
        byte b1 = 5;
        byte b2 = 10;
        // byte sum = b1 + b2; // Ошибка компиляции: int в byte неявно запрещён
        int sum = b1 + b2; // byte + byte = int (даже одинаковые «малые» типы преобразуем в int)
        System.out.println("byte + byte = " + sum + " (type: int!)");
        double result6 = (b1 + b2) / 2.0; // (b1+b2) = int затем int / double = double
        System.out.println("(byte+byte)/double = " + result6 + " (type: double)");
    }
}