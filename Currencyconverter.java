import java.util.HashMap;
import java.util.Scanner;

public class Currencyconverter {

    public static void main(String[] args) {
        HashMap<Integer, String> CURRENCY = new HashMap<Integer, String>();
        // Add currency codes
        CURRENCY.put(1, "USD");
        CURRENCY.put(2, "CAD");
        CURRENCY.put(3, "EUR");
        CURRENCY.put(4, "HKR");
        CURRENCY.put(5, "INR");

        // Define conversion rates (as of a certain date)
        HashMap<String, Double> CONVERSION_RATES = new HashMap<String, Double>();
        CONVERSION_RATES.put("USD", 1.0);
        CONVERSION_RATES.put("CAD", 1.28); // Example conversion rate, 1 USD to CAD
        CONVERSION_RATES.put("EUR", 0.85); // Example conversion rate, 1 USD to EUR
        CONVERSION_RATES.put("HKR", 7.79); // Example conversion rate, 1 USD to HKR
        CONVERSION_RATES.put("INR", 73.0); // Example conversion rate, 1 USD to INR

        String from, to;
        double amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to currency converter");
        System.out.println("Currency converting from?");
        System.out.println("1: USD(US Dollar)\t2: CAD(Canadian Dollar)\t3: EUR(Euro)\t4: HKR(Hong Kong Dollar)\t5: INR (Indian Rupees)");
        from = CURRENCY.get(sc.nextInt());
        System.out.println("Currency converting to?");
        System.out.println("1: USD(US Dollar)\t2: CAD(Canadian Dollar)\t3: EUR(Euro)\t4: HKR(Hong Kong Dollar)\t5: INR (Indian Rupees)");
        to = CURRENCY.get(sc.nextInt());
        System.out.println("Enter the amount you wish to convert?");
        amount = sc.nextDouble();

        // Check if the selected currencies are valid
        if (CONVERSION_RATES.containsKey(from) && CONVERSION_RATES.containsKey(to)) {
            // Perform the conversion
            double convertedAmount = amount * (CONVERSION_RATES.get(to) / CONVERSION_RATES.get(from));
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, from, convertedAmount, to);
        } else {
            System.out.println("Invalid currency selection.");
        }

        sc.close();
    }}
