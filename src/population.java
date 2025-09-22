import java.util.Scanner;

public class population {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int start_pop;
        int end_pop;

        do {
            System.out.print("Starting townspeople population? = ");
            start_pop = scanner.nextInt();
        } while (start_pop < 9);

        do {
            System.out.print("Ending townspeople population? = ");
            end_pop = scanner.nextInt();
        } while (end_pop < start_pop);

        int years = 0;

        do {
            start_pop = start_pop + (start_pop / 3) - (start_pop / 4);
            years++;
        } while (start_pop < end_pop);

        System.out.printf("Number of years needed to reach that goal: %d", years);
    }

}
