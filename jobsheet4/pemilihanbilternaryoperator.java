import java.util.Scanner ;

public class pemilihanbilternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan sebuah angka :");
        int angka = sc.nextInt();
        String hasil ;
        hasil = (angka %2 == 0 ) ? "merupakan bilangan genap " :"merupakan bilangan ganjil";
        System.out.println(angka + "adalah " + hasil);
    }
    
}