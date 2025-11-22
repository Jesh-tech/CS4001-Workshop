package week3;

import java.util.Scanner;

class RickshawFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat;

        do {
            double baseFare = 50;
            double perKmRate = 20;
            double perMinRate = 2;
            double totalFare;

            System.out.print("Enter distance (in km): ");
            double distance = sc.nextDouble();

            System.out.print("Enter time (in minutes): ");
            double time = sc.nextDouble();

            System.out.print("Is the customer a local? (yes/no): ");
            String isLocal = sc.next().toLowerCase();

            System.out.print("Is it night-time travel? (yes/no): ");
            String isNight = sc.next().toLowerCase();

            totalFare = baseFare + (distance * perKmRate) + (time * perMinRate);

            totalFare -= (isLocal.equals("yes") && distance > 10) ? 30 : 0;

            totalFare += (isNight.equals("yes")) ? 25 : 0;

            System.out.println("\n\tFinal Fare: Rs. " + (int)totalFare);

            System.out.print("\nDo you want to calculate another fare? (yes/no): ");// Ask if user wants to calculate again
            repeat = sc.next().toLowerCase();
            System.out.println();

        } while (repeat.equals("yes"));

        sc.close();
        System.out.println("Thank you for using IICSafarisewa!");
    }
}
