class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0);//вызывает конструктор A(int a)
        z = 1;
    }

    public A(int a) {
        this(a, 0);//вызывает конструктор A(int a, int b)
        z = 1;
    }

    public A(int a, int b) {
        this(a, b, 0);//вызывает конструктор A(int a, int b, int c)
        z = 1;
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1;
    }

    static void print(A obj) {
        System.out.println("a = " + obj.a +
                ", b = " + obj.b +
                ", c = " + obj.c +
                ", z = " + obj.z);
    }
}
