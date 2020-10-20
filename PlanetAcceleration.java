package ua.com.solarsystem.core;

import ua.com.solarsystem.util.AccelerationUtil;

public interface PlanetAcceleration {

    default double acceleration(double m, double r) {
        double g;
        g = AccelerationUtil.freeFallAcceleration(m, r);
        return g;
    }
}
