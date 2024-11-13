import java.util.*;
public class tugas1 {
    public static void main(String[] args) {
        Scanner fatma = new Scanner(System.in);

        System.out.print("masukkan nilai N =");
        int N=fatma.nextInt();

        if (N < 3) { System.out.println("Nilai N harus minimal 3"); 
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}