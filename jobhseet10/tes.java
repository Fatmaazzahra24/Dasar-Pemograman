import java.util.Arrays;
import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int []array = {};

       int [][] number = {{1,2}, {3,4,5}, {6,7}};
        System.out.println("================================");
       
        for (int i = 0; i < number.length; i++) {  
            for (int j =0; j < number[0].length; j++){
                System.out.println(Arrays.toString(number[i]));
            } 
        }
        

    }
}
