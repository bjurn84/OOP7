class RationalCalculator implements Calculator {
    @Override
    public RationalNumber add(Number a, Number b) {
        return ((RationalNumber) a).add((RationalNumber) b);
    }

    @Override
    public RationalNumber subtract(Number a, Number b) {
        return ((RationalNumber) a).subtract((RationalNumber) b);
    }

    @Override
    public RationalNumber multiply(Number a, Number b) {
        return ((RationalNumber) a).multiply((RationalNumber) b);
    }

    @Override
    public RationalNumber divide(Number a, Number b) {
        return ((RationalNumber) a).divide((RationalNumber) b);
    }
}
