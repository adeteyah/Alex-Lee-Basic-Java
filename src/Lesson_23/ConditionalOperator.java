package Lesson_23;

import java.util.Scanner;

public class ConditionalOperator {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=ln_vMXXXeDI&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=23
     */
    public static void main(String[] args) {
        //ayah 0 suka 6 ibu 1 suka 9
        String orangtua;
        Scanner s = new Scanner(System.in);
        System.out.print("Ayah suka 6, Ibu suka 9.\nAyah/Ibu: ");
        orangtua = s.nextLine();
        if (orangtua.equalsIgnoreCase("ayah")) {
            System.out.println("6 keluar");
        } else if (orangtua.equalsIgnoreCase("ibu")) {
            System.out.println("9 keluar");
        } else {
            System.out.println("Ngaco lo!");
        }
    }
}
