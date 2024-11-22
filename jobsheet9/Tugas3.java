import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice" };

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananyangdicari = scanner.nextLine();

        boolean tersedia = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananyangdicari)) {
                tersedia = true;
                break;
            }
        }

        if (tersedia) {
            System.out.println(makananyangdicari + " tersedia di menu.");
        } else {
            System.out.println(makananyangdicari + " tidak ada di menu.");
        }

    }
}
