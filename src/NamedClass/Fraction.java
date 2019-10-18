package NamedClass;

/**
 * Created by User on 14 Окт., 2019
 */

public class Fraction implements Comparable<Fraction> {
    private final long top;
    private final long bottom;

    public Fraction(long numerator, long denominator) {
        top = numerator;
        bottom = denominator;
    }

    @Override
    public int hashCode() {
        return 17 * Long.hashCode(top) + Long.hashCode(bottom);
    }

    @Override
    public boolean equals(Object o) {
        return compareTo((Fraction) o) == 0;
    }

    @Override
    public int compareTo(Fraction f2) {
        return Long.compare(top * f2.bottom, f2.top * bottom);
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public Fraction add(Fraction f2) {
        long newDenominator = lcm(bottom, f2.bottom);
        long newNumerator = top * (newDenominator / bottom) + f2.top * (newDenominator / f2.bottom);
        long gcd = gcd(newNumerator, newDenominator);
        if (gcd != 1){
            newNumerator /= gcd;
            newDenominator /= gcd;
        }
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}
