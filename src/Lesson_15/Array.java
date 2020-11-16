package Lesson_15;

public class Array {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=xzjZy-dHHLw&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=15
     */
    public static void main(String[] args) {
        System.out.println("Program bantai zombie");

        String backpack[] = {"Shotgun", "AR", "Sniper"};
        String zombies [] = {"Witch", "Bomber", "Civil Zombie"};
        int numbersZombiesHate[] = {69, 666};

        System.out.println("\nBackpack");
        for (String x: backpack) {
            System.out.println(x);
        }
        System.out.println("\nZombie Types");
        for (String y: zombies) {
            System.out.println(y);
        }
        System.out.println("\nNumbers Zombie Hate");
        for (int i: numbersZombiesHate) {
            System.out.println(i);
        }
    }
}
