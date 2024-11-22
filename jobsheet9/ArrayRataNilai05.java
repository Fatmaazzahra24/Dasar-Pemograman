import java.util.Scanner;

public class ArrayRataNilai05 {

    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    
    System.out.print("masukkan jumlah  mahasiswa : ");
    int JmlMhs = fatma.nextInt();

    int [] NilaiMhs = new  int [JmlMhs];
    int Mhslulus =0 , Mhstidaklolos=0;
    double totallulus=0, totaltidaklulus=0 ;


   for (int i =0; i < JmlMhs; i++) {
       System.out.print("masukkan nilai mahasiswa ke-" +(i+1) +"=");
       NilaiMhs[i]=fatma.nextInt();
   }

   for (int i = 0; i < JmlMhs; i++) {
        if (NilaiMhs [i] > 70 ) {
            Mhslulus ++;
            totallulus += NilaiMhs[i];
        }else {
            Mhstidaklolos ++;
            totaltidaklulus += NilaiMhs [i];
        }
    }
    double rataratalulus = totallulus/Mhslulus;
    double rataratatidaklulus = totaltidaklulus/Mhstidaklolos;
    System.out.println("rata rata nilai lulus " + rataratalulus);
    System.out.println("rata rata nilai tidak lulus" + rataratatidaklulus);
    
}
}