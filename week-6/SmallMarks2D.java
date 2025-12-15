package Week6;

public class SmallMarks2D {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75},
            {90, 85} 
        };

        String[] subjects = {"Nepali", "English"};

        // Print table
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(subjects[j] + "=" + marks[i][j] + " ");
                total += marks[i][j];
            }
            System.out.println("Total=" + total);
        }
    }
}
