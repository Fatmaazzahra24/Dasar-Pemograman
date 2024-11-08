import java.util.*;
public class Triangle05 {

    public static void main(String[] args) {
    Scanner fatma= new Scanner(System.in);

    System.out.print("masukkan nilai N=");
    int N = fatma.nextInt();
    int i=0;

    while (i<= N) {
        int j= 0 ;
        while (j <= i ) {
            System.out.print("*");
            j++;
        }
        System.out.println();
        i++;
    }
    
    }
    
}