public class Main {
    public static void main(String[] args) {
        // Пример использования
        IComplexNumber num1 = new ComplexNumber(2, 3);
        IComplexNumber num2 = new ComplexNumber(1, 4);

        IComplexCalculator calculator = new ComplexCalculator();

        IComplexNumber sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum.getRealPart() + " + " + sum.getImaginaryPart() + "i");

        IComplexNumber product = calculator.multiply(num1, num2);
        System.out.println("Product: " + product.getRealPart() + " + " + product.getImaginaryPart() + "i");
    }
}
