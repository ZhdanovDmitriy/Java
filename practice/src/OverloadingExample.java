class OverloadingExample {
    public void printValue(int x) {
        System.out.println("int: " + x);
    }
    public void printValue(double x) {
        System.out.println("double: " + x);
    }
    public void printValue(String x) {
        System.out.println("String: " + x);
    }
}