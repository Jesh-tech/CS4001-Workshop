package week3;

public class LiteralPractice
{
    public static void main(String[] args) {
        long bigNumber = 123456789L;// 'L' suffix for long
        float piValue = 3.1416f;// 'f' suffix for float
        char copyright = '\u00A9'; 
        
        System.out.println("Long literal: " + bigNumber);
        System.out.println("Float literal: " + piValue);
        System.out.println("Char literal (Unicode): " + copyright);

    }

}