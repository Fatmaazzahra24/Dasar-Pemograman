import java.util.Scanner;

public class ArrayNilai05 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    
    int [] NilaiAkhir = new int[10];
    for (int i=0; i<NilaiAkhir.length;i++) {
        System.out.print("masukkan nilai akhirke-"+i+" : ");
        NilaiAkhir[i]=fatma.nextInt();
    }

    for (int i = 0; i < NilaiAkhir.length; i++) {
        if (NilaiAkhir[i] >70 ) {
            System.out.println("Mahasiswa ke-" + i + "lulus!");
        }else {
            System.out.println("Mahasiswa ke-" + i +"tidak lulus");
        }
    }
    

    }
}