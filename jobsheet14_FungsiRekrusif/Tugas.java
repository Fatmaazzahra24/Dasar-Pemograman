import java.util.Scanner;
public class Tugas {

    public static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) { 
            return 0;
        } else {
            return angka[n - 1] + hitungTotalRekursif(angka, n - 1);
        }
    }
    public static int hitungTotalIteratif(int[] angka) {
        int total = 0;
        for (int nilai : angka) {
            total += nilai;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = scanner.nextInt();

        int[] angka = new int[N];
        for (int i = N; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[N - i] = scanner.nextInt();
        }
        int totalRekursif = hitungTotalRekursif(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + totalRekursif);
    }
}
