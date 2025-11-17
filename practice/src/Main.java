public class Main {
    public static void main(String[] args) {
        //через имя класса (рекомендуемый способ для static-методов)
        A.printVars();

        //через null-ссылку (антипаттерн)
        A obj1 = null;
        obj1.printVars();

        //через не-null объект (тоже антипаттерн)
        A obj2 = new A();
        obj2.printVars();
    }
}

class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}