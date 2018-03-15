package lfa.backend;

import java.util.Scanner;

/**
 * Zeichnet einen Christbaum mit Sternen.
 * Die Höhe des Baums bestimmt der User, in dem er die Anzahl branches eingibt.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, y, a, b, stars = 0, spaces = 0;

        System.out.print("Enter number of branches: ");
        int branches = sc.nextInt();

        for (i = 0; i <= branches; i++) {
            spaces = branches - i;
            for (y = 0; y < spaces; y++) {
                System.out.print(" ");
            }
            if (i != 1)
                stars = i + i - 1;
            else
                stars = 1;

            for (j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (a = 0; a < 2; a++) {
            for (b = 0; b <= branches - 2; b++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}

