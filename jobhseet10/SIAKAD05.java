import java.util.Scanner;

public class SIAKAD05 {
    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);

    System.out.print("Masukkan jumlah Mahasiswa :");
    int JmlMhs = fatma.nextInt();

    System.out.print("Masukkan jumlah mata kuliah :");
    int JmlMatkul=fatma.nextInt();

    int [][] nilai = new int [JmlMhs][JmlMatkul];

    for (int i = 0; i < JmlMhs; i++) {
        System.out.println("input nilai mahasiswa ke-" + (i+1));
        double totalPerSiswa = 0;

        for (int j = 0; j < JmlMatkul; j++) {
            System.out.print("nilai mata kuliah " +  (j+1)  + ":");
            nilai [i][j] = fatma.nextInt(); 
            totalPerSiswa += nilai [i][j];
        }
        System.out.println("nilai rata rata : " + totalPerSiswa/JmlMatkul);
    }

    System.out.println("\n===============================================");
    System.out.println(" Rata rata nilai setiap mata kuliah :");
    
    for (int j = 0; j < JmlMatkul; j++) {
        double totalPerMatkul = 0;

        for (int i = 0; i < JmlMhs; i++) {
            totalPerMatkul += nilai [i][j];
        }
        System.out.println("Mata Kuliah " +(j+1) + " :" +totalPerMatkul/JmlMhs);
    }

    
    }
    
}