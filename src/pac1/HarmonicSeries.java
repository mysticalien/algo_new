package pac1;

public class HarmonicSeries {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("Число %d: %.4f%n", i, harmonic);
        }
    }
}
