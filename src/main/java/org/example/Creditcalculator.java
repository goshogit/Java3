package org.example;

public class Creditcalculator {
    public static void main(String[] args) {
      //  calculateCreditDetails("Иван Иванов ", 19, 2000, 24);
        calculateCreditDetails("Петър Петров", int age "17" , amount 3000,  months 10);

    }

    private static void calculateCreditDetails(String петърПетров, String age, int amount, int months) {
    }

    private static void calculateCreditDetails(String fullname, int age, int amount, int months) {
        if (age < 18) {
            System.out.println("Трябва да имате навършени 18 години");
        } else {
            if (amount > 1000) {
                if (months > 12) {
                    System.out.println("Не може да изтеглете сума под 1000 лева за период по дълъг от 12 месеца");
                } else {
                    double monthlyPayment = amount / months;
                    System.out.println("Месечна вноска е равна на " + monthlyPayment);
                }
            } else {
                double interestRate = getInterestRate(amount);
                double totalAmount = amount + (amount * interestRate * months / 12);
                double monthlyPayment = totalAmount / months;
                System.out.printf("Месечна вноска за сума от %d лева за %d месеца с лихва" + "%.2f% e % 2f лева.%n", amount, months, interestRate * 100, monthlyPayment);

            }

        }
    }

    private static double getInterestRate(int amount) {
        if (amount <= 5000) {
            return 0.05; // 5% лихва за суми до 5000 лева
        } else if (amount <= 10000) {
            return 0.04; // 4% лихва за суми до 10000 лева
        } else {
            return 0.03;
        }
    }
}
