package ua.com.solarsystem.util;

public final class AccelerationUtil {

    public static double freeFallAcceleration(double m, double r) {

        final double gg = 6.67;
        double g = (gg * m) / (r * r);
        return g;
    }
}
