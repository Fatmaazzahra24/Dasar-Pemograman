import java.util.Scanner;

public class ArrayRataNilai05 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    
   int [] NilaiMhs = new int[10];
   double total = 0;
   double ratarata ;

   for (int i =0; i < NilaiMhs.length; i++) {
       System.out.print("masukkan nilai mahasiswa ke-" +(i+1) +"=");
       NilaiMhs[i]=fatma.nextInt();
   }

   for (int i = 0; i < NilaiMhs.length; i++) {
       total += NilaiMhs [i];
   }
   ratarata = total/NilaiMhs.length;
   System.out.println("Rata rata nilai Mahasiswa adalah : "+ ratarata);

    }
}