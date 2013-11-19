public class Rational {

    // instance variables                                                                                                                                                          
    public int numerator;
    public int denominator;

    // accessor methods                                                                                                                                                            
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // default constructor                                                                                                                                                         
    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    // constructor                                                                                                                                                                 
    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
        if (d == 0) {
            d = 1;
            n = 0;
        }
    }

    //overwrite toString                                                                                                                                                           
    public String toString() {
        return numerator +  "/" + denominator;
    }

    public float floatValue() {
        return numerator/denominator;
    }

    public void multiply(Rational r) {
        numerator = (numerator*r.getNumerator());
        denominator = (denominator*r.getDenominator());
        System.out.println(r);
    }
       public void divide(Rational r) {
        numerator = (numerator*r.getDenominator());
        denominator = (denominator*getNumerator());
        System.out.println(r);
    }
    public void add(Rational r) {
        if (denominator == r.getDenominator()) {
            numerator = numerator + r.getNumerator();
            denominator = denominator;
        }
        else {
            numerator = (numerator*r.getDenominator() +
                         denominator* r.getNumerator());
            denominator = (denominator*r.getDenominator());
        }
        System.out.println(r);
    }

    public void subtract(Rational r) {
        if (denominator== r.getDenominator()) {
            numerator = (numerator - r.getNumerator());
            denominator = denominator;
        }
else {
            numerator = (numerator*r.getDenominator() +
                         denominator*r.getNumerator());
            denominator = (denominator*r.getDenominator());
        }
        System.out.println(r);
    }
    public static int gcd( int n, int d) {
        if (n > d) {
            while (n%d != 0) {
                int oldD = d;
                d = n%d;
                n = oldD;
            }
            return d;
        }
        else if (d > n) {
            while(d%n != 0) {
                int oldN = n;
                n = d%n;
                d = oldN;
            }
            return n;
        }
        else {
            return n;
        }
    }

    public int compareTo(Rational r) {
        if((numerator/denominator) == (r.getNumerator()/r.getDenominator())) {
            return 0;
        }
        else if(((numerator/denominator) < (r.getNumerator()/r.getDenominator()))) {
            return 1;
        }
        else {
            return -1;
        }
    }
  public static void main(String[] args) {
        Rational cat = new Rational();
        System.out.println("Your number: " + cat);
        System.out.println("Numerator: " + cat.getNumerator());
        System.out.println("Denominator: " + cat.getDenominator());
        Rational otherCat = new Rational(3,4);
        System.out.println("Your other number: " + otherCat);
        System.out.println("Your other number as a decimal: " +
                           otherCat.floatValue());
        Rational thirdCat = new Rational(60,61);
        otherCat.multiply(thirdCat);
        otherCat.divide(thirdCat);
        otherCat.add(thirdCat);
        otherCat.subtract(thirdCat);
        System.out.println("GCD of " + otherCat + "'s numerator and" +
                           otherCat + "'s denominator: " +
                           otherCat.gcd(otherCat.getNumerator()
                                        , otherCat.getDenominator()));
        System.out.println("Comparing " + otherCat + " to " + thirdCat + ": " +
                           otherCat.compareTo(thirdCat));

    }
}


