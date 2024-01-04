import java.util.Random;

public class PowerOfTwo {
    
    public static void main(String[] args) {
        printPowersOf2(10);
    }

    public static void printPowersOf2(int N) {
        if (N < 0 || N >= 31) {
            System.out.println("The power value N must be between 0 and 30.");
            return;
        }

        int i = 0;
        int power = 1;

        while (i <= N) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
            i++;
        }
    }
}
