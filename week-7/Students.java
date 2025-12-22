package week7;

class Students {
    // Attributes
    String name;
    String studentId;
    int age;
    String course;

    // Constructor
    Students(String name, String studentId, int age, String course) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.course = course;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        //Student class object
        Students obj1 = new Students("Prijesh", "NP05CP4A250069", 20, "BIT");
        Students obj2 = new Students("Aayush", "NP05CP4A250040", 21, "BCA");
        Students obj3 = new Students("Dibya", "NP05CP4A250029", 19, "BSc CSIT");

        // Display info for all students
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
    }
}