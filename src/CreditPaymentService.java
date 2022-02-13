public class CreditPaymentService {
    public double calculate(
            double amount, double percent, double month
    ) {
        double percent1 = percent / 100;
        double a1 = percent1 / 12;
        double a2 = 1 + a1;
        double a31 = 1 / a2;
        double a3 = Math.exp(month * Math.log(a31));
        double a41 = 1 - a3;
        double a4 = amount * percent1 / 12;
        double a5 = a4 / a41;
        return a5;
    }
}