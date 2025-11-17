
public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();

        //доступ к public — разрешён из любого места
        System.out.println("publicField = " + d.publicField);

        //доступ к protected — разрешён, т.к. Main и Demo в одном пакете (дефолтном)
        System.out.println("protectedField = " + d.protectedField);

        //доступ к полю без модификатора (package-private) — разрешён, т.к. тот же пакет
        System.out.println("defaultField = " + d.defaultField);

        //доступ к private — запрещён — будет ошибка компиляции:
        //System.out.println(d.privateField); // ОШИБКА: privateField has private access in Demo

        //внутри Demo есть getter, который позволяет прочитать private поле
        System.out.println("privateField через getter = " + d.getPrivateField());

        //изменить private напрямую — нельзя, но можно через setter
        d.setPrivateField(999);
        System.out.println("privateField после set = " + d.getPrivateField());
    }
}

class Demo {
    private int privateField = 1;
    int defaultField = 2;
    protected int protectedField = 3;
    public int publicField = 4;

    public int getPrivateField() {
        return privateField;
    }

    public void setPrivateField(int value) {
        if (value >= 0) {
            privateField = value;
        }
    }
}