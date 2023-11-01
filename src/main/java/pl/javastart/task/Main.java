package pl.javastart.task;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String nameProductOne = "Mleko";
        String producerProductOne = "Mlekowita";
        double priceProductOne = 2.5;
        String nameProductTwo = "Czekolada";
        String producerProductTwo = "Wedel";
        double priceProductTwo = 2.19;

        System.out.printf(Locale.US, "%s %s %.1fzł%n", nameProductOne, producerProductOne, priceProductOne);
        System.out.printf(Locale.US, "%s %s %.2fzł", nameProductTwo, producerProductTwo, priceProductTwo);
    }
}
