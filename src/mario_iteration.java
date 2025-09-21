import java.util.Scanner;

public class mario_iteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height: ");
        int height = scanner.nextInt();

        new draw_iteration(height);
    }
}

class draw_iteration {
    draw_iteration(int h) {
        int spaces = h - 1;
        int blocks = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < blocks; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
            spaces--;
            blocks++;
        }
    }
}