import java.util.Scanner;

public class pemilihan2percobaan1 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner (System.in);

        System.out.println("masukkan tahun : ");
        int tahun = input05.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            System.out.println("Tahun Kabisat");
        } else 
            System.out.println("Bukan Tahun Kabisat");
        }
}