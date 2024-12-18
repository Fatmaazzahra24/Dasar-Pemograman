import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] survey = { {1,2}, {2,3,4}, {6,5}}; 

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Masukkan jawaban untuk responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Rata-rata setiap responden:");
        for (int i = 0; i < 10; i++) {
            double total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rataRata = total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRata);
        }

        System.out.println("Rata-rata setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rataRata = total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRata);
        }
        
        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.println("Rata-rata keseluruhan: " + rataRataKeseluruhan);
    }
}

