package Lesson_21;

public class JavaTypeCasting {
    /**
     * Tutorial link:
     * https://www.youtube.com/watch?v=H0LNjF9PSeM&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ&index=21
     * byte ke double bisa, double ke byte gabisa kecuali di convert
     */
    public static void main(String[] args) {
        byte a = 127; // 8 bit
        short b = 32767; // 16 bit
        char c = 'A'; // 32 bit
        int d = 2147483647; // 32 bit
        long e = 9223372036854775807L; // 64 bit
        float f = 9223372036854775807F; // 64 bit
        double g = 9223372036854775807D; //64 bit

        // int ex = f; <- gabisa turun bit harus dipakein type casting ky dibawah
        int ex = (int)f;
        System.out.println(ex);
    }
}
