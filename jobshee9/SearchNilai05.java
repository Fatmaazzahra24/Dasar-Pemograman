import java.util.Scanner;

public class SearchNilai05 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    
    int JmlMhs = 0;
    int hasil = 0, key =0;

    System.out.print("Masukan nilai yang akan di input : ");
    JmlMhs = fatma.nextInt();

    int nilai []=new int [JmlMhs];
    for (int i=0;i < nilai.length;i++) {
        System.out.print("masukkan nilai mahasiswa ke- " +(i+1) + " : " );
        nilai[i]=fatma.nextInt();
    }

    System.out.print("masukkan nilai yang ingin dicari  : ");
    key=fatma.nextInt();
    for (int i=0; i<nilai.length;i++) {
        if (key == nilai[i]) {
            hasil = i;
            System.out.println();
            System.out.println("Nilai " +key + " Adalah nilai Mahasiswa ke-" +hasil);
            System.out.println();
            break;
        }else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
            break;
        }
    }
    }
}