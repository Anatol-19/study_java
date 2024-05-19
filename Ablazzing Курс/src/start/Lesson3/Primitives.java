package start.Lesson3;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения (булевы значения)
        boolean answerYa = false;
        boolean answerNeYa = true;

        //Целые числа
        // Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из 2 байт или 16 бит
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4 быйт или 32 бит
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое цисло, которое состоит из 8 байт или 64 бит
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Double - число с плавоющей точкой 64 bit
        double MyBottle = 1.5;

        //Float - число с плавающей точкой 32 bit
        float cola = 0.33F;

        //Char - character (символ) 16 bit
        char letter = 'Я' + 1;

        System.out.println(letter);
    }
}
