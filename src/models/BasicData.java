package models;


public abstract class BasicData {

    public double number;


    public double getAmount() {
        return this.number;
    }

    public void setAmount(double number) {
        this.number = number;
    }


    public void breakLine() {
        System.out.println("----------------------------");
    }


    public double getExchangeRate(String fromCurrency, String toCurrency) {
        // Zwraca ustaloną stałą stawkę wymiany dla PLN na USD
        if (fromCurrency.equals("PLN") && toCurrency.equals("USD")) {
            return 0.26 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla USD na PLN
        if (fromCurrency.equals("USD") && toCurrency.equals("PLN")) {
            return 3.85 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla PLN na EUR
        if (fromCurrency.equals("PLN") && toCurrency.equals("EUR")) {
            return 0.22 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla EUR na PLN
        if (fromCurrency.equals("EUR") && toCurrency.equals("PLN")) {
            return 4.55 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla EUR na USD
        if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return 1.12 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla USD na EUR
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return 0.89 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla JPY na USD
        if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
            return 0.0091 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla USD na JPY
        if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
            return 109.61 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla JPY na EUR
        if (fromCurrency.equals("JPY") && toCurrency.equals("EUR")) {
            return 0.0077 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla EUR na JPY
        if (fromCurrency.equals("EUR") && toCurrency.equals("JPY")) {
            return 129.74 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla JPY na PLN
        if (fromCurrency.equals("JPY") && toCurrency.equals("PLN")) {
            return 0.0342 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla PLN na JPY
        if (fromCurrency.equals("PLN") && toCurrency.equals("JPY")) {
            return 29.24 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla GBP na USD
        if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            return 1.36 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla USD na GBP
        if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            return 0.73 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla GBP na EUR
        if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            return 1.17 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla EUR na GBP
        if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            return 0.85 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla GBP na PLN
        if (fromCurrency.equals("GBP") && toCurrency.equals("PLN")) {
            return 5.26 * number;
        }
        // Zwraca ustaloną stałą stawkę wymiany dla PLN na GBP
        if (fromCurrency.equals("PLN") && toCurrency.equals("GBP")) {
            return 0.19 * number;
        }

        return 0;
    }
}