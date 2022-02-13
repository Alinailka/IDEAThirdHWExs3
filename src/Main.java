public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double credit12Month = service.calculate(1000000, 9.99, 12);
        System.out.println("Ежемесячный платеж по кредиту на 12 месяцев = " + credit12Month + " рублей");

        double credit24Month = service.calculate(1000000, 9.99, 24);
        System.out.println("Ежемесячный платеж по кредиту на 24 месяца = " + credit24Month + " рублей");

        double credit36Month = service.calculate(1000000, 9.99, 36);
        System.out.println("Ежемесячный платеж по кредиту на 36 месяцев = " + credit36Month + " рублей");
    }
}