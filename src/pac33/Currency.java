package pac33;

public interface Currency {
    Currency RUB = new Rubles();
    Currency EUR = new Euros();

    double convert(Currency from, double amount);

    double course(Currency from);

    abstract class AbstractCurrency implements  Currency {
        private final String code;

        protected AbstractCurrency(String code) {
            this.code = code;
        }

        @Override
        public double course(Currency from) {
            if (from instanceof Euros && this instanceof Rubles) {
                return 100;
            } else if (from instanceof Rubles && this instanceof Euros) {
                return 100;
            }
            return 0;
        }

        @Override
        public String toString() {
            return code;
        }
    }

    final class Euros extends AbstractCurrency {

        Euros() {
            super("EUR");
        }

        @Override
        public double convert(Currency from, double amount) {
            if (from instanceof Euros) {
                return amount;
            } else if (from instanceof Rubles) {
                return amount / course(from);
            }
            throw new UnsupportedOperationException("Currency " + from + " not defined");
        }
    }

    final class Rubles extends AbstractCurrency {

        Rubles() {
            super("RUB");
        }

        @Override
        public double convert(Currency from, double amount) {
            if (from instanceof Rubles) {
                return amount;
            } else if (from instanceof Euros) {
                return amount * course(from);
            }
            throw new UnsupportedOperationException("Currency " + from + " not defined");
        }
    }
}
