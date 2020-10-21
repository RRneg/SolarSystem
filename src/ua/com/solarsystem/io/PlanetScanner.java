package ua.com.solarsystem.io;

import java.util.Scanner;

public class PlanetScanner {
    int choice; // выбор планеты


    public int planetScaner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello my friend. Today we will get acquainted with the acceleration of free fall on the planets of the solar system.\n" +
                "In order to learn about acceleration on a specific planet, make your choice:\n" +
                "1. Venus\n" +
                "2. Earth\n" +
                "3. Mars\n" +
                "4. Mercury\n" +
                "5. Neptune\n" +
                "6. Pluto\n" +
                "7. Saturn\n" +
                "8. Uranus\n" +
                "9. Jupiter");


        choice = input.nextInt();
        while (choice < 1 || choice > 9) {
            System.out.println("Select wrong, repeat");
            choice = input.nextInt();
        }
        return choice;
    }

}




