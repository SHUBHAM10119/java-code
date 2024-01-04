public class HarmonicNumber {
    public static void main(String[] args) {
        printHarmonicNumber(10);
    }

    public static void printHarmonicNumber(int N) {
        if (N <= 0) {
            System.out.println("The Harmonic Value N must be a positive integer.");
            return;
        }

        double harmonicNumber = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Number is: " + harmonicNumber);
    }
}
