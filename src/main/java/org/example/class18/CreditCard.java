package org.example.class18;
// Create a class CreditCard Create an instance method that will calculate interest based
// on the given balance.Create 2 subclasses: Visa and AX. In AX class override method
// calculate interest.
//﻿﻿Call the method by creating an object of each of the three classes.
public class CreditCard {
    protected double balance;
    public CreditCard(double balance) {
        this.balance = balance;
    }public double calculateInterest(double interestRate) {
        // Assuming interestRate is in percentage
        double interest = (interestRate / 100.0) * balance;
        return interest;
    }
}
class Visa extends CreditCard {
    public Visa(double balance) {
        super(balance);
    }
    // No need to override calculateInterest() method for Visa class
}
class AX extends CreditCard {
    public AX(double balance) {
        super(balance);
    }
    @Override
    public double calculateInterest(double interestRate) {
        // Assuming different calculation for AX credit cards
        // For example, AX credit cards have a different interest calculation method
        double interest = (interestRate / 100.0) * 1.5 * super.calculateInterest(interestRate);
        return interest;
    }
}
class CreditCardTester {
    public static void main(String[] args) {
        double balance = 1000.0; // Example balance
        double interestRate = 15.0; // Example interest rate (in percentage)
        CreditCard genericCard = new CreditCard(balance);
        Visa visaCard = new Visa(balance);
        AX axCard = new AX(balance);
        double interestGeneric = genericCard.calculateInterest(interestRate);
        double interestVisa = visaCard.calculateInterest(interestRate);
        double interestAX = axCard.calculateInterest(interestRate);

        System.out.println("Interest on generic card: $" + interestGeneric);
        System.out.println("Interest on Visa card: $" + interestVisa);
        System.out.println("Interest on AX card: $" + interestAX);
    }
}
