import java.util.Scanner;

public class Kafe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo;  

        int totalHarga = menu("Andi", sc);

        System.out.print("\nMasukkan kode promo (jika ada): ");
        kodePromo = sc.next(); 
        totalHarga = hitungDiskon(totalHarga, kodePromo); 

        System.out.println("Total harga pesanan Anda: Rp " + totalHarga);
    }

    public static int menu(String namaPelanggan, Scanner sc) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        return tampilkanMenu(sc);
    }

    public static int tampilkanMenu(Scanner sc) {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahMenu = sc.nextInt();

        int totalHarga = 0;
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nomor menu yang ingin dipesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            int banyakItem = sc.nextInt();
            totalHarga += hitungTotalHarga05(pilihanMenu, banyakItem); 
        }

        System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
        return totalHarga; 
    }

    public static int hitungTotalHarga05(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungDiskon(int totalHarga, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
            return totalHarga / 2;  
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
            return totalHarga - (totalHarga * 30 / 100);  
        } else {
            System.out.println("Kode promo tidak valid.");
            return totalHarga;  
        }
    }
}