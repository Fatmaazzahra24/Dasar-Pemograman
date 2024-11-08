import java.util.Scanner;

public class pemilihan2percobaan205 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input05 = new Scanner(System.in);
        int pilihan_menu;
        String member, pembayaran;
        double total_bayar, harga = 0, diskon = 0;
        int potonganQRIS = 1000;  

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihan_menu = input05.nextInt();
        input05.nextLine();  

        System.out.print("Apakah anda punya member (y/n)?: /n" + " haloparagraf");
        member = input05.nextLine();

        System.out.print("Apakah pembayaran menggunakan QRIS (y/n)?: ");
        pembayaran = input05.nextLine();
        System.out.println("----------------------------------------");

        
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl: Rp " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea: Rp " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea): Rp " + harga);
        } else {
            System.out.println("Pilihan menu tidak valid, silakan masukkan pilihan yang benar.");
            return;  
        }

        // Mengecek apakah pembeli memiliki member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon untuk member: 10%");
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0;  
        } else {
            System.out.println("Status member tidak valid.");
            return;  
        }
        total_bayar = harga - (harga * diskon);

        // Menambahkan potongan harga jika menggunakan QRIS
        if (pembayaran.equalsIgnoreCase("y")) {
            total_bayar -= potonganQRIS;
            System.out.println("Potongan harga QRIS: Rp 1.000");
        }

        // Menampilkan total bayar
        System.out.println("Total bayar: Rp " + total_bayar);
        System.out.println("----------------------------------------");
    }
}
