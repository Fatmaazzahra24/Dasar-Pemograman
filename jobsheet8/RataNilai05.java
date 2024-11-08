import java.util.*;
public class RataNilai05 {

    public static void main(String[] args) {
    Scanner fatma= new Scanner(System.in);
    int i , j, nilai ;
    float  TotalNilai=0, RataNilai ;
    
    i=1;
    while (i<=5) {
        System.out.println("input nilai mahasiswa ke "+i);
        for (j=1;j <=5;j++) {
            System.out.print("masukkan nilai ke-" +j+ "=");
            nilai= fatma.nextInt();
            TotalNilai += nilai;
        }
        RataNilai=TotalNilai/5;
        System.out.print("rata rata nilai mahasiswa ke "+i+" adalah = "+RataNilai);
        i++;
    }

        

    
    }
    
}