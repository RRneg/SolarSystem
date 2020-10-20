package ua.com.solarsystem.util;

public final class AccelerationUtil {

    public static double freeFallAcceleration(double m, double r) {
        double g;
        final double gg = 6.67;
        g = (gg * m) / (r * r);
        return (g);
    }
}
