package Lesson_17;

public class ConvertStringtoInt2 {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=Pnaqn6GOyzU&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=17
     */
    public static void main(String[] args) {
        String s = "Adit 665";
        s = s.replaceAll("\\D+", "");
        int n = Integer.parseInt(s);
        System.out.println(n + 1);
    }
}
