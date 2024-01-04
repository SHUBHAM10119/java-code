import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("head or tial");
//         int userInput=input.nextInt();

//         if (userInput == 0|| userInput ==1) {
            
//         }
//         else{
//             System.out.println("exiting..");
//             System.exit(userInput);
//         }
//     }
// }

    public static void main(String[] args) {
        flipCoin(1000);
    }

    public static void flipCoin(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        Random rand = new Random();
        int heads = 0, tails = 0;

        for (int i = 0; i < n; i++) {
            if (rand.nextDouble() < 0.5)
                tails++;
            else
                heads++;
        }

        double headsPercentage = (double) heads / n * 100;
        double tailsPercentage = (double) tails / n * 100;

        System.out.println("Percentage of Heads: " + headsPercentage + "%");
        System.out.println("Percentage of Tails: " + tailsPercentage + "%");
    }
}
