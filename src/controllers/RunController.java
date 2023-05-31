package controllers;

import models.zlotowki;
import models.BasicData;
import models.euro;
import models.jeny;
import models.funty;
import models.dolary;

import java.util.Arrays;
import java.util.Scanner;


public class RunController extends BasicData {


    public void run() {
        Scanner scanner = new Scanner(System.in);
        // Poproś użytkownika o podanie waluty, którą chce przeliczyć
        System.out.println("Podaj jaką walutę chcesz przeliczyć: (EUR / USD / PLN / JPY / GBP)");
        String decision = scanner.nextLine();
        String fromCurrency;

        // Użyj instrukcji switch do obsługi różnych opcji walutowych
        switch (decision) {
            case "EUR" -> {
                euro euro = new euro();
                euro.welcome(decision);
                euro.breakLine();
                fromCurrency = "EUR";
                // Poproś użytkownika o podanie ilości waluty, którą chce przeliczyć
                System.out.println("Podaj ilość:");
                double amount = Double.parseDouble(scanner.nextLine());
                euro.setAmount(amount);
                this.setAmount(amount); // Ustaw wartość name w tej instancji
                // Poproś użytkownika o podanie waluty, na którą chce przeliczyć
                System.out.println("Podaj na jaką walutę: (EUR / USD / PLN / JPY / GBP)");
                String toCurrency = scanner.nextLine();
                euro.setType(toCurrency);
                System.out.println(Arrays.toString(euro.EuroData()));
                System.out.println("Przeliczona wartość: " + getExchangeRate(fromCurrency, toCurrency));

            }
            case "USD" -> {
                dolary dolary = new dolary();
                dolary.welcome(decision);
                dolary.breakLine();
                fromCurrency = "USD";
                // Poproś użytkownika o podanie ilości waluty, którą chce przeliczyć
                System.out.println("Podaj ilość:");
                double amount = Double.parseDouble(scanner.nextLine());
                dolary.setAmount(amount);
                this.setAmount(amount);  // Ustaw wartość name w tej instancji
                // Poproś użytkownika o podanie waluty, na którą chce przeliczyć
                System.out.println("Podaj na jaką walutę: (EUR / USD / PLN / JPY / GBP)");
                String toCurrency = scanner.nextLine();
                dolary.setType(toCurrency);
                System.out.println(Arrays.toString(dolary.DolaryData()));
                System.out.println("Przeliczona wartość: " + getExchangeRate(fromCurrency, toCurrency));

            }
            case "PLN" -> {
                zlotowki zlotowki = new zlotowki();
                zlotowki.welcome(decision);
                zlotowki.breakLine();
                fromCurrency = "PLN";
                // Poproś użytkownika o podanie ilości waluty, którą chce przeliczyć
                System.out.println("Podaj ilość:");
                double amount = Double.parseDouble(scanner.nextLine());
                zlotowki.setAmount(amount);
                this.setAmount(amount);  // Ustaw wartość name w tej instancji
                // Poproś użytkownika o podanie waluty, na którą chce przeliczyć
                System.out.println("Podaj na jaką walutę: (EUR / USD / PLN / JPY / GBP)");
                String toCurrency = scanner.nextLine();
                zlotowki.setType(toCurrency);
                System.out.println(Arrays.toString(zlotowki.ZlotowkiData()));
                System.out.println("Przeliczona wartość: " + getExchangeRate(fromCurrency, toCurrency));

            }

            case "JPY" -> {
                jeny jeny = new jeny();
                jeny.welcome(decision);
                jeny.breakLine();
                fromCurrency = "JPY";
                // Poproś użytkownika o podanie ilości waluty, którą chce przeliczyć
                System.out.println("Podaj ilość:");
                double amount = Double.parseDouble(scanner.nextLine());
                jeny.setAmount(amount);
                this.setAmount(amount);  // Ustaw wartość name w tej instancji
                // Poproś użytkownika o podanie waluty, na którą chce przeliczyć
                System.out.println("Podaj na jaką walutę: (EUR / USD / PLN / JPY / GBP)");
                String toCurrency = scanner.nextLine();
                jeny.setType(toCurrency);
                System.out.println(Arrays.toString(jeny.JenyData()));
                System.out.println("Przeliczona wartość: " + getExchangeRate(fromCurrency, toCurrency));

            }

            case "GBP" -> {
                funty funty = new funty();
                funty.welcome(decision);
                funty.breakLine();
                fromCurrency = "GBP";
                // Poproś użytkownika o podanie ilości waluty, którą chce przeliczyć
                System.out.println("Podaj ilość:");
                double amount = Double.parseDouble(scanner.nextLine());
                funty.setAmount(amount);
                this.setAmount(amount);  // Ustaw wartość name w tej instancji
                // Poproś użytkownika o podanie waluty, na którą chce przeliczyć
                System.out.println("Podaj na jaką walutę: (EUR / USD / PLN / JPY / GBP)");
                String toCurrency = scanner.nextLine();
                funty.setType(toCurrency);
                System.out.println(Arrays.toString(funty.FuntyData()));
                System.out.println("Przeliczona wartość: " + getExchangeRate(fromCurrency, toCurrency));

            }
            default -> {
                System.out.println("Błędny wybór!");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Do widzenia.");
    }
}
