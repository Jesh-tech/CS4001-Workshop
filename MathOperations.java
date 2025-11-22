package week3;

class MathOperations{
    public static void main(String[] args){
        int a=10;
        int b=5;
        
        //arthmetric..
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));
        
        //relational.....
        System.out.println("a>b: " + (a>b));
        System.out.println("a==b: " + (a==b));
        
        //logical...
        boolean x=true, y=false;
        System.out.println("x && y: " + (x&&y));
        System.out.println("x || y: " + (x||y));
        System.out.println("!x: " + (!x));
        //assignment...
        int c = a;
        c += b;
        System.out.println("c after+=b: " + c);
        
        //unary..
        System.out.println("++a: " + (++a));
        System.out.println("--b: " + (--b));


    }
}
