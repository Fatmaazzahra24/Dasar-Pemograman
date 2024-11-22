import java.util.Scanner;

public class SIAKAD05 {
    public static void main(String[] args) {
    Scanner fatma=new Scanner(System.in);
    int [][] nilai = new int [4][3];

    for (int i = 0; i < nilai.length; i++) {
        System.out.println("input nilai mahasiswa ke-" + (i+1));
        double totalPerSiswa = 0;

        for (int j = 0; j < nilai[i].length; j++) {
            System.out.print("nilai mata kuliah " +  (j+1)  + ":");
            nilai [i][j] = fatma.nextInt(); 
            totalPerSiswa += nilai [i][j];
        }
        System.out.print("nilai rata rata : " + totalPerSiswa/3);
    }

    System.out.println("\n===============================================");
    System.out.println(" Rata rata nilai setiap mata kuliah :");
    
    for (int j = 0; j < 3; j++) {
        double totalPerMatkul = 0;

        for (int i = 0; i < 4; i++) {
            totalPerMatkul += nilai [i][j];
        }
        System.out.println("Mata Kuliah " +(j+1) + " :" +totalPerMatkul/4);
    }

    
    }
    
}