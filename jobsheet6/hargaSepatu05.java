import java.util.Scanner;

/**
 * hargaSepatu05
 */
public class hargaSepatu05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String merk, kategori ;
        int ukuran, harga = 0;

        System.out.print("Masukkan merk sepatu (Converse, Sketcher, Nike): ");
        merk = input05.nextLine();

        System.out.print("Masukkan kategori sepatu (Slip on, high top, woman, man, kids, adult): ");
        kategori = input05.nextLine();
        
        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input05.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("Slip on")) {
                if (ukuran >=36) {
                    if (ukuran <=40) {
                        harga = 800000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >=40) {
                    if (ukuran <=44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >=36) {
                    if (ukuran <=41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >=41) {
                    if (ukuran <=44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >=36) {
                    if (ukuran <=40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >=40) {
                    if (ukuran <=44) {
                        harga = 1500000;
                    }
                }
            }
        } 
        

        if (harga > 0) {
            System.out.println("Harga sepatu " + merk + " kategori " + kategori + " ukuran " + ukuran + " adalah: Rp" + harga);
        } else {
            System.out.println("Data yang dimasukkan tidak valid. Coba cek kembali merk, kategori, atau ukuran.");
        }

        input05.close(); 
    }
}
