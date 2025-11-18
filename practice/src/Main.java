// Перечисление с инициализацией элементов через конструктор
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double surfaceGravity() {
        final double G = 6.67300e-11;
        return G * mass / (radius * radius);
    }

    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("%s: %.2f m/s²%n", p, p.surfaceGravity());
        }
    }
}