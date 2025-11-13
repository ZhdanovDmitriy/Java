public class Practice1 {
    public static void main(String[] args) {
        byte b = 255;
        byte b0 = 0;
        short s = 32000;
        short s0 = 0;
        int i = 10000000;
        int i0 = 0;
        long l = 99999999999L;
        long l0 = 0L;
        float f = 1.23f;
        float f0 = 0.0f;
        double d = 12.23454;
        double d0 = 0.0;
        char c = 'A';
        char c0 = '\u0000';
        boolean bool = true;
        boolean bool0 = false;
        System.out.println("byte: " + b + ", нулевое значение: " + b0);
        System.out.println("short: " + s + ", нулевое значение: " + s0);
        System.out.println("int: " + i + ", нулевое значение: " + i0);
        System.out.println("long: " + l + ", нулевое значение: " + l0);
        System.out.println("float: " + f + ", нулевое значение: " + f0);
        System.out.println("double: " + d + ", нулевое значение: " + d0);
        System.out.println("char: " + c + ", нулевое значение: " + (int)c0);
        System.out.println("boolean: " + bool + ", нулевое значение: " + bool0);
}
