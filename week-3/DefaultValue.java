package week3;


/**
 * Week3 workshop Programming
 *
 * @author (Prijesh Kamat)
 */
public class DefaultValue
{
        boolean b;
        byte by;
        short s;
        int i;
        long l;
        float f;
        double db;
        char c;
    public static void main(String[]args){
    DefaultValue obj = new DefaultValue();
    System.out.println("Defult Boolean: " +obj.b);
    System.out.println("Default byte: " + obj.by);
    System.out.println("Default short: " + obj.s);
    System.out.println("Default int: " + obj.i);
    System.out.println("Default long: " + obj.l);
    System.out.println("Default float: " + obj.f);
    System.out.println("Default double: " + obj.db);
    System.out.println("Default char: '" + obj.c);
    }

    }