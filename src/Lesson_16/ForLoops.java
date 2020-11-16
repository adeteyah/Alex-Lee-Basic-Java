package Lesson_16;

import java.util.Scanner;

public class ForLoops {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=3jMaKlNBjug&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=16
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputTerminal;

        for (int i = 0; i <= 11;) {
            System.out.print("\nNgewe(y/n)? ");
            inputTerminal = s.nextLine();
            if (inputTerminal.equalsIgnoreCase("y")) {
                i++;
                System.out.println("Asik, punya %s anak!".formatted(i));
                if (i == 11) {
                    System.out.println("\nJadilah keluarga Atta!");
                }
            } else if (inputTerminal.equalsIgnoreCase("n")) {
                System.out.println("\nOkay...");
            } else {
                System.out.println("\nGaboleh ngasal!");
                System.exit(0);
            }
        }

    }
}
