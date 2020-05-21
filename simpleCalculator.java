public class simpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionalResult() {
        double additionalResult = firstNumber + secondNumber;
        return additionalResult;
    }

    public double getSubtractionResult() {
        double subtractionResult = firstNumber - secondNumber;
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        double multiplicationResult = firstNumber * secondNumber;
        return multiplicationResult;
    }

    public double getDivisionnResult() {
        if (secondNumber == 0) {
            double divisionResult = 0;
            return 0;
        } else {
            double divisionResult = firstNumber / secondNumber;
return divisionResult;
        }
    }
}
