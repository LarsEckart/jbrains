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

    public Fraction add(Fraction that) {
        if (this.hasSameDenominatorAs(that)) {
            Fraction result = new Fraction(this.numerator + that.numerator, this.denominator);

            result = toLowestTerm(result);
            return result;
        } else {
            final Fraction x = toSameDenominatorAs(that);
            final Fraction y = that.toSameDenominatorAs(this);

            return x.add(y);
        }
    }

    private Fraction toLowestTerm(Fraction result) {
        int i = 2;
        while (i <= result.denominator) {
            if (result.numerator % i == 0 && result.denominator % i == 0) {
                result = new Fraction(result.numerator / i, result.denominator / i);
            } else {
                i++;
            }
        }
        return result;
    }

    private boolean hasSameDenominatorAs(Fraction summand) {
        return this.denominator == summand.denominator;
    }

    private Fraction toSameDenominatorAs(Fraction summand) {
        return new Fraction(this.numerator * summand.denominator,
                            this.denominator * summand.denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        final Fraction that = (Fraction) other;

        return (this.numerator == that.numerator) && (denominator == that.denominator);
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
