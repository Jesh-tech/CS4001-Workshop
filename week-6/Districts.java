package Week6;

import java.util.Scanner;

public class Districts {
    public static void main(String[] args) {
        String[] districts = {"Morang", "Kathmandu", "Kaski", "Sindhuli"};

        System.out.println("Original districts:");
        for (int i = 0; i < districts.length; i++) {
            System.out.println((i + 1) + ". " + districts[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of districts: ");
        int n = input.nextInt();
        input.nextLine();

        String[] newDistricts = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter district " + (i + 1) + ": ");
            newDistricts[i] = input.nextLine();
        }

        System.out.println("Updated districts:");
        for (int i = 0; i < newDistricts.length; i++) {
            System.out.println((i + 1) + ". " + newDistricts[i]);
        }
    }
}
