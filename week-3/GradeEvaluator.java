package week3;
import java.util.Scanner;

class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creating the scanner class object
        double grade;
        do{
        System.out.print("Enter your grade: ");
        grade =sc.nextDouble();
        
        if(grade<0 || grade>100){
        System.out.println("\n\tInvalid input!");}
        }while(grade<0 || grade>100);
        
        String result = (grade >= 40) ? "Pass" : "Fail";
        System.out.println(result);

    }
}
