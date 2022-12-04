package ru.netology.finances;

public class Finances {

    public static double monthlyPayment(double start, double amount, int years) {
        double payment = (amount - start) / (years * 12);
        return payment;
    }
}