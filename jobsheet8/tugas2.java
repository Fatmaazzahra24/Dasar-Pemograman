import java.util.*;
public class tugas2 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    String cabang_olahraga, nama_atlet, daftaratlet="" ;
    int j ;

    for (int i=1;i<=4;i++) {
        if (i == 1 ) {
            cabang_olahraga= "Badminton" ;
        } else if (i == 2) {
            cabang_olahraga = "Tenis meja";
        }else if (i == 3) {
            cabang_olahraga = "Basket";
        } else if (i == 4) {
            cabang_olahraga = " Voly";
        } 
        System.out.print("masukkan jenis  cabang olahraga (Badminton, Tenis meja, Basket, Voly ) =" );
        cabang_olahraga=fatma.nextLine();

        System.out.println("masukkan nama 5 atlet untuk cabang olahraga  " +cabang_olahraga);
        for ( j = 1; j <=5 ;j++) {
            System.out.print("nama atlet ke-" +j + ":");
            nama_atlet=fatma.nextLine();
            daftaratlet += j + "." +nama_atlet + "\n";
            
        }
        System.out.println("\nBerikut daftar nama atlet untuk cabang olahraga " + cabang_olahraga );
        System.out.println(daftaratlet);
        System.out.println("======================================");
    }
    }
}
