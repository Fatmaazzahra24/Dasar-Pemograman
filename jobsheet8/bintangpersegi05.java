import java.util.*;
public class bintangpersegi05 {

    public static void main(String[] args) {
    Scanner fatma= new Scanner(System.in);

    System.out.print("masukkan nilai N=");
    int N = fatma.nextInt();

    for (int i =1; i<=N;i++) {
        for (int j=0; j<=N;j++) {
            System.out.print("*");
        }
    System.out.println();
    }
    }
    
}