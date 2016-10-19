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
        if (hasSameDenominator(summand)) {
            Fraction result = new Fraction(this.numerator + summand.numerator, this.denominator);

            result = toLowestTerm(result);
            return result;
        } else {
            final Fraction x = toSameDenominatorAs(summand);
            final Fraction y = summand.toSameDenominatorAs(this);

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

    private boolean hasSameDenominator(Fraction summand) {
        return this.denominator == summand.denominator;
    }

    private Fraction toSameDenominatorAs(Fraction summand) {
        return new Fraction(this.numerator * summand.denominator,
                            this.denominator * summand.denominator);
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
