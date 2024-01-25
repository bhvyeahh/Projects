import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Currency Converter");
        System.out.println("1. Dollar to Rupees");
        System.out.println("2. Euro to Rupees");
        System.out.println("3. Pound to Rupees");
        System.out.println("4. Rupees to Dollar");
        System.out.println("5. Rupees to Euro");
        System.out.println("6. Rupees to Pound");
        System.out.print("Enter your choice (1-6): ");
        
        int choice = scanner.nextInt();
        double amount;
        
        switch (choice) {
            case 1:
                System.out.print("Enter amount in dollars: $");
                amount = scanner.nextDouble();
                convertDollarToRupees(amount);
                break;
            case 2:
                System.out.print("Enter amount in euros: €");
                amount = scanner.nextDouble();
                convertEuroToRupees(amount);
                break;
            case 3:
                System.out.print("Enter amount in pounds: £");
                amount = scanner.nextDouble();
                convertPoundToRupees(amount);
                break;
            case 4:
                System.out.print("Enter amount in rupees: ₹");
                amount = scanner.nextDouble();
                convertRupeesToDollar(amount);
                break;
            case 5:
                System.out.print("Enter amount in rupees: ₹");
                amount = scanner.nextDouble();
                convertRupeesToEuro(amount);
                break;
            case 6:
                System.out.print("Enter amount in rupees: ₹");
                amount = scanner.nextDouble();
                convertRupeesToPound(amount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
    
    private static void convertDollarToRupees(double dollars) {
        double exchangeRate = 74.0; // Example exchange rate: 1 USD = 74 INR
        double rupees = dollars * exchangeRate;
        System.out.println("Converted amount: ₹" + rupees);
    }
    
    private static void convertEuroToRupees(double euros) {
        double exchangeRate = 88.0; // Example exchange rate: 1 EUR = 88 INR
        double rupees = euros * exchangeRate;
        System.out.println("Converted amount: ₹" + rupees);
    }
    
    private static void convertPoundToRupees(double pounds) {
        double exchangeRate = 103.0; // Example exchange rate: 1 GBP = 103 INR
        double rupees = pounds * exchangeRate;
        System.out.println("Converted amount: ₹" + rupees);
    }
    
    private static void convertRupeesToDollar(double rupees) {
        double exchangeRate = 1 / 74.0;
        double dollars = rupees * exchangeRate;
        System.out.println("Converted amount: $" + dollars);
    }
    
    private static void convertRupeesToEuro(double rupees) {
        double exchangeRate = 1 / 88.0;
        double euros = rupees * exchangeRate;
        System.out.println("Converted amount: €" + euros);
    }
    
    private static void convertRupeesToPound(double rupees) {
        double exchangeRate = 1 / 103.0;
        double pounds = rupees * exchangeRate;
        System.out.println("Converted amount: £" + pounds);
    }
}
