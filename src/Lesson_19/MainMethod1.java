package Lesson_19;

public class MainMethod1 {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=xJ2rCeDtyyk&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=19
     * Buat list access modifiernya lihat disini:
     * https://www.javatpoint.com/access-modifiers
     */
    public static void main(String[] args) {
        sayHi();
        sayKill();
    }

    static void sayHi() {
        System.out.println("Hi!");
    }

    private static void sayKill() {
        System.out.println("Kill!");
    }
}
