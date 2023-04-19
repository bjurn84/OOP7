class ComplexCalculator implements Calculator {
    @Override
    public ComplexNumber add(Number a, Number b) {
        return ((ComplexNumber) a).add((ComplexNumber) b);
    }

    @Override
    public ComplexNumber subtract(Number a, Number b) {
        return ((ComplexNumber) a).subtract((ComplexNumber) b);
    }

    @Override
    public ComplexNumber multiply(Number a, Number b) {
        return ((ComplexNumber) a).multiply((ComplexNumber) b);
    }

    @Override
    public ComplexNumber divide(Number a, Number b) {
        return ((ComplexNumber) a).divide((ComplexNumber) b);
    }
}