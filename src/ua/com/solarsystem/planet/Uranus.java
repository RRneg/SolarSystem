package ua.com.solarsystem.planet;

import ua.com.solarsystem.core.PlanetAcceleration;
import ua.com.solarsystem.util.AccelerationUtil;

public class Uranus implements PlanetAcceleration {


    double g;


    public double acceleration(double m, double r) {
        AccelerationUtil accelerationUtil = new AccelerationUtil();
        g = accelerationUtil.freeFallAcceleration(m, r);
        return g;
    }
}


