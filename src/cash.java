import java.util.Scanner;

public class cash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int change, quarters = 0, dimes = 0, nickels = 0, pennies = 0, total_coins = 0;

        do {
            System.out.print("Change owed: ");
            change = scanner.nextInt();
        } while (change < 0);


        if (change == 0) {
            System.out.printf("%d\n", total_coins);
        } else {
            do {
                if (change >= 25) {
                    change -= 25;
                    quarters++;
                }
                if (change >= 10 && change < 25) {
                    change -= 10;
                    dimes++;
                }
                if (change >= 5 && change < 10) {
                    change -= 5;
                    nickels++;
                }
                if (change >= 1 && change < 5) {
                    change -= 1;
                    pennies++;
                }
            } while (change > 0);

            total_coins = quarters+dimes+nickels+pennies;
            System.out.printf("%d\n", total_coins);
        }


    }
}
