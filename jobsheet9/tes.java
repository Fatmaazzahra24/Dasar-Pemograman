import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array 2D untuk menyimpan hasil survei
        int[][] survey = new int[10][6]; // 10 responden, 6 pertanyaan

        // Input data survei
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan jawaban untuk responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan hasil survei
        System.out.println("\nHasil survei:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Responden " + (i + 1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.print(survey[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nRata-rata setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rataRata = total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRata);
        }

        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rataRata = total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }
        

        System.out.println("\nRata-rata keseluruhan:");
        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);


        scanner.close();
    }
}

