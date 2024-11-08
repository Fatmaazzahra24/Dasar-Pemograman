import java.util.*;

public class tugas1 {

    public static void main(String[] args) {
        Scanner fatma = new Scanner(System.in);
        int n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("3");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}