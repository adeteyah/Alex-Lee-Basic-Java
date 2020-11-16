package Lesson_20;

import java.util.Scanner;

public class JavaModulus {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=4f9qfuUN5aE&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=20
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan nomor: ");
        int inputTerminal = s.nextInt();
        if ((inputTerminal % 2) == 0) {
            System.out.println("Genap!");
        } else {
            System.out.println("Ganjil");
        }
    }
}
