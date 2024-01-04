public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29; // number to check
        System.out.println(isPrime(num) ? num + " is a prime number" : num + " is not a prime number");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
