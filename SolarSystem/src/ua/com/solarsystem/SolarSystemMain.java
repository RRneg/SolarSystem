package ua.com.solarsystem;

import ua.com.solarsystem.io.PlanetChoice;
import ua.com.solarsystem.io.PlanetReporter;
import ua.com.solarsystem.io.PlanetScanner;
import ua.com.solarsystem.planet.*;

public class SolarSystemMain {


    public static void main(String[] args) {
        int choice;
        double g = 0;

        PlanetScanner planetScanner = new PlanetScanner();
        choice = planetScanner.planetScaner();
        System.out.println(choice);

        PlanetChoice planetChoice = new PlanetChoice();
        g = planetChoice.planetChoice(choice);


        PlanetReporter planetReporter = new PlanetReporter();
        planetReporter.planetReporter(g);


    }
}
