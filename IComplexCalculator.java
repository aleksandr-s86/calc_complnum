// Интерфейс для калькулятора комплексных чисел
interface IComplexCalculator {
    IComplexNumber add(IComplexNumber a, IComplexNumber b);
    IComplexNumber multiply(IComplexNumber a, IComplexNumber b);
    IComplexNumber divide(IComplexNumber a, IComplexNumber b);
}