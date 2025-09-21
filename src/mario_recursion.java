import java.util.Scanner;

public class mario_recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height: ");
        int height = scanner.nextInt();
        int original = height;
        new draw_recursion(height, original);
    }
}

class draw_recursion {
    draw_recursion(int h, int o) {
        if (h <= 0) {
            return;
        }

        int spaces = h - 1 ;
        int blocks = o - spaces;

        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < blocks; k++) {
            System.out.print("#");
        }
        System.out.print("\n");

        new draw_recursion(h - 1, o);
    }
}