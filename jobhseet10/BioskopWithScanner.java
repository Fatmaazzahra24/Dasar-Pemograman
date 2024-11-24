import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);

    int baris , kolom ;
    String next, nama ;
        
    String [][] penonton = new String[4][2];

    while (true) { 
        System.out.println("========SELAMAT DATANG DI BIOSKOP===========");
        System.out.println("Silahkan memilih ");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1/2/3) : ");
        int menu = fatma.nextInt();
        fatma.nextLine();

        if  (menu == 1 ) {
            while (true) { 
                System.out.print("Masukkan nama :");
                nama = fatma.nextLine();
                System.out.print("Masukan Baris (1-4): ");
                baris = fatma.nextInt();
                System.out.print("Masukan Kolom (1-2): ");
                kolom = fatma.nextInt();
                fatma.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                    System.out.println("Nomor baris/kolom tidak tersedia. Silakan masukkan ulang!");
                } else {
                    if (penonton [baris-1] [kolom-1] !=null) {
                        System.out.println("Kursi yang anda pilih sudah terisi, Silahkan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Penonton " + nama + " berhasil masuk ke baris " + baris + " kolom " + kolom);
                        break;
                    }
                }
            }
        }

        else if (menu == 2) {
            System.out.println("Daftar penonton :");
            for (int i = 0; i < penonton.length; i++) {
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        System.out.print("***\t");
                    }else {
                        System.out.print(penonton[i][j] + "\t");
                    }
                }
                System.out.println();
            }
       }

       else if (menu == 3) {
            System.out.println("Program selesai.");
            break;
        }
        else {
            System.out.println("Pilihan menu tidak valid. Coba lagi.");
        }
    }
    }
    
}