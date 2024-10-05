import java.util.Scanner;

public class pemilihan2percobaan205 {

    public static void main(String[] args) {
        
        Scanner input05 = new Scanner (System.in);
        int pilihan_menu;
        String member ;
        double  total_bayar, harga, diskon ;

        System.out.println("----------------------------------------");
        System.out.println("============ MENU KAFE JTI =============");
        System.out.println("----------------------------------------");
        System.out.println("1.Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input05.nextInt();
        input05.nextLine();
        System.out.println("Apakah anda punya member (y/n) ?=");
        member = input05.nextLine();
        System.out.println("----------------------------------------");

        //jika pembeli punya member 
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println(" Besar diskon = 10% ");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga Ricebowl = " + harga);

            }else if (pilihan_menu == 2 ) {
                harga = 3000;
                System.out.println("Harga Ice tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " +harga );

            } else {
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }

            //menghitung total bayar setelah diskon 
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        }

        //jika pembeli tidak memiliki member

        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println(" Harga Ice Tea = " + harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga paket bundling = " + harga);
                
            }else {
                System.out.println("masukkan pilihan menu dengan benar ");
                return;
            }

            //menghitung total bayar 

            System.out.println("total bayar =" + harga);

        }else {
            System.out.println("member tidak valid ");
        }
        System.out.println("----------------------------------------");
    }
    
}