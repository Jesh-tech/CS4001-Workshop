package Week6;

import java.util.Scanner;

public class SimpleNumbers {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50};

        System.out.println("Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = input.nextInt();
        int[] newScores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for subject " + (i + 1) + ": ");
            newScores[i] = input.nextInt();
        }

        System.out.println("Updated Scores:");
        for (int s : newScores) {
            System.out.println(s);
        }

        int newSum = 0;
        int newHighest = newScores[0];
        int newLowest = newScores[0];
        for (int s : newScores) {
            newSum += s;
            if (s > newHighest) newHighest = s;
            if (s < newLowest) newLowest = s;
        }
        double newAverage = (double) newSum / newScores.length;

        System.out.println("Updated Sum = " + newSum);
        System.out.println("Updated Average = " + newAverage);
        System.out.println("Updated Highest = " + newHighest);
        System.out.println("Updated Lowest = " + newLowest);
    }
}
