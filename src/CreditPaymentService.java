public class CreditPaymentService {
    public int calculate(double sum, double proc, double kvop) {
        double mps = proc / 12 / 100;
        double result = mps * Math.pow((1 + mps), kvop) / (Math.pow((1 + mps), kvop) - 1);
        result = result * sum;
        return (int) result;
        //sum сумма кредита
        //proc процент
        //mps месячная процентная ставка
        //kvop количество месяцев (срок кредита)
        }
}
