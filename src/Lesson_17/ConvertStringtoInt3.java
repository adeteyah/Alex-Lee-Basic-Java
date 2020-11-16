package Lesson_17;

import java.util.Optional;
import java.util.Scanner;

public class ConvertStringtoInt3 {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=Pnaqn6GOyzU&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=17
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan numeric kalo tidak tidak akan di return: ");
        String a = s.nextLine();
        if (!tryParseInteger(a).isEmpty()) {
            int b = tryParseInteger(a).get();
            System.out.println(b);
        }
    }
    public static Optional<Integer> tryParseInteger(String string) {
        try {
            return Optional.of(Integer.valueOf(string));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
