package Lesson_18;

public class TwoDimensionArray {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=L3-q2GxAqZA&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=18
     */
    public static void main(String[] args) {
        int [][] lotteryCard = {
                {20, 1, 12},
                {56, 26, 75},
                {14, 4, 2}
        };
        for (int a = 0; a < lotteryCard.length; a++) {
            for (int b = 0; b < lotteryCard[a].length; b++) {
                System.out.print(lotteryCard[a][b]);
            }
            System.out.println();
        }
    }
}
