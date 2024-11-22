import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    
    System.out.print("Masukkan  banyaknya nilai Mahasiswa yang diinput :");
    int JmlMhs =fatma.nextInt();

    int [] NilaiMhs = new int [JmlMhs];
    double total=0, ratarata ;
    int max =Integer.MIN_VALUE;
    int min =Integer.MAX_VALUE;

    for (int i = 0; i < JmlMhs; i++) {
        System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+ " : ");
        NilaiMhs[i]=fatma.nextInt();
        total +=NilaiMhs[i];
        if (NilaiMhs[i] > max) {
            max = NilaiMhs[i];
        } else if (NilaiMhs[i] < min) {
            min = NilaiMhs[i];
        }
    }
    
    System.out.println("===============================================");

    for ( int i = 0; i < JmlMhs;i++) {
        System.out.println("Nilai Mahasiswa ke-" +(i+1)+ " : "+NilaiMhs[i]);
    }
    ratarata = total/NilaiMhs.length;
    System.out.println("Rata rata nilai Mahasiswa adalah :" +ratarata);
    System.out.println("Nilai maksimal adalah : " +max );
    System.out.println("Nilai minimal adalah : " +min );  
    
}
}