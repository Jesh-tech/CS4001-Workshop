package Week6;
import java.util.Scanner;

public class StudentArray
{
    public static void main(String[] args){
        String[] students = {"Asha", "Ramesh", "Sita", "Binod", "Sabita"};

    System.out.println("Student list");
    for (int i=0; i<students.length; i++){
        System.out.println(students[i]);        
    }
    System.out.println("Name at index 2: "+students[2]);
    
    students[4]= "Aayush";
    System.out.println("Name updated at index 4: "+ students[4]);
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a new student name: ");
    students[0]=sc.nextLine();
    
    System.out.println("Updated Student list");
    for (String s : students){
    System.out.println(s);
    }
}
}