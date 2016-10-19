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
        if (this.denominator == summand.denominator) {
            final Fraction result = new Fraction(this.numerator + summand.numerator, this.denominator);
            if (result.numerator == result.denominator) {
                return new Fraction(1);
            }
            return result;
        } else {
            final Fraction x = new Fraction(this.numerator * summand.denominator,
                                            this.denominator * summand.denominator);
            final Fraction y = new Fraction(summand.numerator * this.denominator,
                                            summand.denominator * this.denominator);

            Fraction z = x.add(y);

            int i = 2;
            while (i <= z.denominator) {
                if (z.numerator % i == 0 && z.denominator % i == 0) {
                    z = new Fraction(z.numerator / i, z.denominator / i);
                } else {
                    i++;
                }
            }
            return z;
        }
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
