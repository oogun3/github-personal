public class main {
    public static void main(String[] args) {
        simpleCalculator calculator = new simpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);
        System.out.println("add " + calculator.getAdditionalResult());
        System.out.println("subtract " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply " + calculator.getMultiplicationResult());
        System.out.println("subtract " + calculator.getDivisionnResult());

    }
}
