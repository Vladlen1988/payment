import ru.netology.finances.Finances;

class Main {
    public static void main(String[] args) {
        double payment = Finances.monthlyPayment(200000.00, 2600000.00, 2);
        System.out.println("Ежемесячный платеж будет " + payment + " руб.");
    }
}