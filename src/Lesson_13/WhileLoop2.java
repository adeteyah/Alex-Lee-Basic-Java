package Lesson_13;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoop2 {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=SGJ9DpxGCkY&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=13
     */
    public static void main(String[] args) {
        String sentence = "Flapjacks are awesome!";
        Scanner s = new Scanner(sentence);
        ArrayList<String> words = new ArrayList<>();

        //has next misah String dari spasi
        while(s.hasNext()) {
            words.add(s.next());
        }

        System.out.println(words);
    }
}
