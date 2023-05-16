public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("1000000 рублей под 9.99% на год (12месяцев)");
        System.out.println("Ежемесячный платеж " + (service.calculate(1_000_000, 9.99, 12)));
        System.out.println();
        System.out.println("1000000 рублей под 9.99% на 2 года (24месяцев)");
        System.out.println("Ежемесячный платеж " + (service.calculate(1_000_000, 9.99, 24)));
        System.out.println();
        System.out.println("1000000 рублей под 9.99% на 3 года (36месяцев)");
        System.out.println("Ежемесячный платеж " + (service.calculate(1_000_000, 9.99, 36)));
        System.out.println();
        System.out.println("30500200 рублей под 8.4% на 4 года (48месяцев)");
        System.out.println("Ежемесячный платеж " + (service.calculate(30_500_200, 8.4, 48)));
    }
}