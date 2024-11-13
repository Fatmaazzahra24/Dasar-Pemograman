import java.util.Scanner;

public class ArrayNilai05 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    
    int [] NilaiAkhir = new int[10];
    for (int i=0; i<10;i++) {
        System.out.print("masukkan nilai akhirke-"+i+" : ");
        NilaiAkhir[i]=fatma.nextInt();
    }

    for (int i = 0; i < 10; i++) {
        System.out.println("nilai akhir ke-"+i+ " adalah = " +NilaiAkhir[i]);
    }
    

    }
}