import java.util.*;
public class square05 {

    public static void main(String[] args) {
    Scanner fatma= new Scanner(System.in);

    System.out.print("masukkan nilai N=");
    int N = fatma.nextInt();

    for (int i =1; i<=N;i++) {
        for (int j=1; j<=N;j++) {
            System.out.print("*");
        }
    System.out.println();
    }
    }
    
}