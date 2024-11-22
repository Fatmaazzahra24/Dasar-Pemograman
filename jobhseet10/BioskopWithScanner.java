import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);

    int baris , kolom ;
    String next, nama ;
        
    String [][] penonton = new String[4][2];

    while (true) { 
        System.out.print("Masukan Nama: ");
        nama = fatma.nextLine();
        System.out.print("Masukan Baris: ");
        baris = fatma.nextInt();
        System.out.print("Masukan Kolom: ");
        kolom = fatma.nextInt();
        fatma.nextLine();

        penonton [baris-1][kolom-1]=nama;

        System.out.print("input penonton lainya? (y/n): ");
        next = fatma.nextLine();

        if (next.equalsIgnoreCase("n")){
        break;
        }

    }
    }
    
}