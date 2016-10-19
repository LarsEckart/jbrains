package ee.tublipoiss.jbrains;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction summand) {
        final Fraction result = new Fraction(this.numerator + summand.numerator, this.denominator);
        if (result.numerator == result.denominator) {
            return new Fraction(1);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) {
            return false;
        }
        return denominator == fraction.denominator;

    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                   "numerator=" + numerator +
                   ", denominator=" + denominator +
                   '}';
    }
}
