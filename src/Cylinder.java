public class Cylinder {

    public static final double PI = Math.PI;

    public static double getVolume(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double basePerimeter = getBasePerimeter(radius);
        return basePerimeter * height + 2 * baseArea;
    }

    private static double getBasePerimeter(int radius) {
        return 2 * PI * radius;
    }

    private static double getBaseArea(int radius) {
        return PI * radius * radius;
    }
}
