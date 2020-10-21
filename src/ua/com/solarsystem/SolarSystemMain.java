package ua.com.solarsystem;

import ua.com.solarsystem.io.PlanetChoice;
import ua.com.solarsystem.io.PlanetReporter;
import ua.com.solarsystem.io.PlanetScanner;
import ua.com.solarsystem.planet.*;

public class SolarSystemMain {


    public static void main(String[] args) {
        int choice;
        double g;

        PlanetScanner planetScanner = new PlanetScanner();
        choice = planetScanner.planetScaner();

        PlanetChoice planetChoice = new PlanetChoice();
        g = planetChoice.planetChoice(choice);


        PlanetReporter planetReporter = new PlanetReporter();
        planetReporter.planetReporter(g);


    }
}
