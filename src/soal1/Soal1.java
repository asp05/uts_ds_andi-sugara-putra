package soal1;

import java.util.Arrays;
import java.util.Scanner;
public class Soal1{
    public static void jawaban(){
        /*
        Buat 15 random array integer dan print semua datanya tentukan ganjil dan genap setiap
        angka random tersebut?
         */
        //initiate and declaration variable
        int[] deretBilangan = {3,4,89,34,22,43,23,12,43,67,2,75,90,76,34};

        //sorting an array from ascending
        Arrays.sort(deretBilangan);

        /*
        lakukan perulangan dan tentukan apakah bilangan ganjil atau genap
         */
        System.out.println("Berikut adalah Deret Bilangan Ganjil dan Genap");
        System.out.println("==============================================");
        for (int i = 0;i < deretBilangan.length;i++){
            if (deretBilangan[i] % 2 == 0){
                System.out.println(deretBilangan[i]+" adalah bilangan genap");
            }else{
                System.out.println(deretBilangan[i]+" adalah bilangan ganjil");
            }
        }

    }
}
