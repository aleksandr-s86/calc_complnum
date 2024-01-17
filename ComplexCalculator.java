// Класс калькулятора комплексных чисел с логированием

import java.util.logging.Logger;

class ComplexCalculator implements IComplexCalculator {
    private Logger logger = Logger.getLogger(ComplexCalculator.class.getName());

    public IComplexNumber add(IComplexNumber a, IComplexNumber b) {
        double realResult = a.getRealPart() + b.getRealPart();
        double imaginaryResult = a.getImaginaryPart() + b.getImaginaryPart();

        logOperation("Addition", a, b, realResult, imaginaryResult);

        return new ComplexNumber(realResult, imaginaryResult);
    }

    public IComplexNumber multiply(IComplexNumber a, IComplexNumber b) {
        double realResult = (a.getRealPart() * b.getRealPart()) - (a.getImaginaryPart() * b.getImaginaryPart());
        double imaginaryResult = (a.getRealPart() * b.getImaginaryPart()) + (a.getImaginaryPart() * b.getRealPart());

        logOperation("Multiplication", a, b, realResult, imaginaryResult);

        return new ComplexNumber(realResult, imaginaryResult);
    }

    public IComplexNumber divide(IComplexNumber a, IComplexNumber b) {
        // Реализация операции деления (можно добавить логирование)
        // ...

        return new ComplexNumber(0, 0); // Заглушка, замените на реальную реализацию
    }

    private void logOperation(String operation, IComplexNumber a, IComplexNumber b, double realResult, double imaginaryResult) {
        logger.info(String.format("%s: %s %s %s = %s", operation, a, getOperatorSymbol(operation), b, new ComplexNumber(realResult, imaginaryResult)));
    }

    private String getOperatorSymbol(String operation) {
        switch (operation) {
            case "Addition":
                return "+";
            case "Multiplication":
                return "*";
            // Добавьте другие операции, если необходимо
            default:
                return "";
        }
    }
}