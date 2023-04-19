public class RationalNumber extends Number {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }

        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}