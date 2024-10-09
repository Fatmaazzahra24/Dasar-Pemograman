import java.util.Scanner;

public class pemilihan2percobaan305 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
  
        String kategori;
        int penghasilan , gaji_bersih ;
        double pajak = 0 ;
        
        System.out.println("masukkan kategori : ");
        kategori = input05.nextLine ();
        System.out.println("masukkan besarnya penghasilan :");
        penghasilan = input05.nextInt();

        //pengecekan kondisi bersarang
        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) 
                    pajak = 0.1;
                    
            else if (penghasilan <= 3000000 ) 
                pajak = 0.15;
            else 
                pajak =0.2;
                gaji_bersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.println("penghasilan bersih : " + gaji_bersih);
            
            
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000 ) 
                pajak = 0.15;    
            
            else if (penghasilan <= 3500000) 
                pajak = 0.2; 
                
            else 
                pajak = 0.25 ;
                gaji_bersih = (int) (penghasilan - (pajak * penghasilan ));
                System.out.println("penghasilan bersih : " + gaji_bersih);
        }else 
            System.out.println(" kategori salah ");

    }
}