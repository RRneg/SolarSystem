package ua.com.solarsystem.io;
import java.util.Scanner;

public class PlanetScanner {
    int choice; // выбор планеты



    public int planetScaner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello my friend. Today we will get acquainted with the acceleration of free fall on the planets of the solar system.\n" +
                "In order to learn about acceleration on a specific planet, make your choice:\n" +
                "1. ua.com.solarsystem.planet.Venus\n" +
                "2. ua.com.solarsystem.planet.Earth\n" +
                "3. ua.com.solarsystem.planet.Mars\n" +
                "4. ua.com.solarsystem.planet.Mercury\n" +
                "5. ua.com.solarsystem.planet.Neptune\n" +
                "6. ua.com.solarsystem.planet.Pluto\n" +
                "7. ua.com.solarsystem.planet.Saturn\n" +
                "8. ua.com.solarsystem.planet.Uranus\n" +
                "9. ua.com.solarsystem.planet.Jupiter");


        choice = input.nextInt();
        while (choice < 1 || choice > 9) {
            System.out.println("Select wrong, repeat");
            choice = input.nextInt();
        }
        System.out.println("Your choice  " + choice);
        return choice;
    }

}




