package week7;

public class KhanaGharMenu {
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;

    // Constructor
    KhanaGharMenu(String itemName, double price, String category, boolean isVegetarian, boolean isAvailable) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
    }

    // Updated display method
    void displayInfo() {
        System.out.printf("%s  Rs. %.2f (%s)%n", itemName, price, category);
        System.out.println("Vegetarian: " + isVegetarian);
        System.out.println("Available: " + isAvailable);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        KhanaGharMenu m1 = new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat", true, true);
        KhanaGharMenu m2 = new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta", true, true);
        KhanaGharMenu m3 = new KhanaGharMenu("Dharane Kalo Bangur", 400, "Meat Special", false, true);
        KhanaGharMenu m4 = new KhanaGharMenu("Sekuwa", 200, "Meat Special", false, false);

        KhanaGharMenu[] menu = {m1, m2, m3, m4};

        System.out.println("--------------- Vegetarian Items ---------------");
        for (KhanaGharMenu item : menu) {
            if (item.isVegetarian) item.displayInfo();
        }

        System.out.println("------------- Non-Vegetarian Items -------------");
        for (KhanaGharMenu item : menu) {
            if (!item.isVegetarian) item.displayInfo();
        }
    }
}
