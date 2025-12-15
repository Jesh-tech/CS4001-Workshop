package Week6;

public class MiniSeating {
    public static void main(String[] args) {
        String[][] seats = {
            {"Asha", "Ramesh", "Sita"},
            {"", "", ""}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == null || seats[i][j].isEmpty()) {
                    System.out.print("[ empty ] ");
                } else {
                    System.out.print("[" + seats[i][j] + "] ");
                }
            }
            System.out.println();
        }
    }
}
