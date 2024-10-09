import java.util.Scanner;

public class diskonbuku05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);

        String jenisbuku ;
        int jumlahbuku ;
        double diskon ;

        System.out.println("masukkan jenis buku (kamus/novel/lainnya ) :");
        jenisbuku = input05.nextLine().toLowerCase();
        System.out.println("masukkan jumlah buku yang dibeli :");
        jumlahbuku = input05.nextInt();

        if (jenisbuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jenisbuku.equalsIgnoreCase("kamus") && (jumlahbuku > 2)) {
                diskon += 0.02;
            }
        } else if (jenisbuku.equalsIgnoreCase("novel")) {
            diskon =0.07;
            if (jenisbuku.equalsIgnoreCase("novel") && (jumlahbuku > 3)) {
                diskon += 0.02; 
            } else {
                diskon += 0.01;
            }
        } else {
            if (jumlahbuku > 3 ) {
                diskon = 0.05;
            }else {
                diskon = 0;
            }
        }
        
        System.out.println("diskon :" +(diskon * 100) );
    }
}
        


