public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234; // number to reverse
        System.out.println("The reverse of " + num + " is " + reverseNumber(num));
    }

    public static int reverseNumber(int num) {
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}
