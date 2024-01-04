public class LeapYear {
    public static void main(String[] args) {
        checkLeapYear(2024);
    }

    public static void checkLeapYear(int year) {
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4 digit number.");
            return;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}
