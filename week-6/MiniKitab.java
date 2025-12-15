package Week6;

public class MiniKitab {
    public static void main(String[] args) {
        String[] categories = {"Fiction", "Nepali"};
        String[][] titles = {{"Asahamati"}, {"Muna Madan"}};
        double[][] prices = {{750.0}, {500.0}};

        double total = 0;

        for (int i = 0; i < categories.length; i++) {
            System.out.printf("%s: %s - Rs. %.2f%n", categories[i], titles[i][0], prices[i][0]);
            total += prices[i][0];
        }

        System.out.printf("Total value of books = Rs. %.2f%n", total);
    }
}
