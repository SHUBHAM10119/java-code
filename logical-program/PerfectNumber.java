public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28; // number to check
        System.out.println(isPerfect(number) ? number + " is a perfect number" : number + " is not a perfect number");
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
